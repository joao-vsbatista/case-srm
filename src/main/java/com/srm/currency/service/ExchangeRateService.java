package com.srm.currency.service;

import com.srm.currency.api.generated.ExchangeRatesApi;
import com.srm.currency.dto.ExchangeRateDto;
import com.srm.currency.entity.Currency;
import com.srm.currency.exception.ResourceNotFoundException;
import com.srm.currency.mapper.ExchangeRateMapper;
import com.srm.currency.entity.ExchangeRate;
import com.srm.currency.model.generated.ExchangeRateCreateOpenApiDto;
import com.srm.currency.model.generated.ExchangeRateOpenApiDto;
import com.srm.currency.repository.CurrencyRepository;
import com.srm.currency.repository.ExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExchangeRateService implements ExchangeRatesApi {

    private final ExchangeRateRepository exchangeRateRepository;
    private final ExchangeRateMapper exchangeRateMapper;
    private final CurrencyRepository currencyRepository;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<ExchangeRateOpenApiDto> getCurrentExchangeRate(String fromCurrency, String toCurrency) {
        try {
            Currency fromCurrencyEntity = findCurrencyByCode(fromCurrency);
            Currency toCurrencyEntity = findCurrencyByCode(toCurrency);

            ExchangeRate exchangeRateEntity = findLatestExchangeRate(fromCurrencyEntity.getId(), toCurrencyEntity.getId());
            ExchangeRateOpenApiDto response = exchangeRateMapper.toExchangeRate(exchangeRateEntity);

            return ResponseEntity.ok(response);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    @Transactional
    public ResponseEntity<ExchangeRateOpenApiDto> updateExchangeRate(String fromCurrency, String toCurrency, ExchangeRateCreateOpenApiDto exchangeRateCreate) {
        try {
            Currency fromCurrencyEntity = findCurrencyByCode(fromCurrency);
            Currency toCurrencyEntity = findCurrencyByCode(toCurrency);

            LocalDate effectiveDate = exchangeRateCreate.getEffectiveDate();
            if (effectiveDate == null) {
                effectiveDate = LocalDate.now();
            }

            var existingRate = exchangeRateRepository.findByFromCurrencyAndToCurrencyAndDate(
                    fromCurrencyEntity.getId(), toCurrencyEntity.getId(), effectiveDate);

            ExchangeRate exchangeRateEntity;
            if (existingRate.isPresent()) {
                exchangeRateEntity = existingRate.get();
                exchangeRateEntity.setRate(exchangeRateCreate.getRate());
                log.info("Updating existing exchange rate for {} to {} on {}",
                        fromCurrency, toCurrency, effectiveDate);
            } else {
                exchangeRateEntity = ExchangeRate.builder()
                        .fromCurrency(fromCurrencyEntity)
                        .toCurrency(toCurrencyEntity)
                        .rate(exchangeRateCreate.getRate())
                        .effectiveDate(effectiveDate)
                        .build();
                log.info("Creating new exchange rate for {} to {} on {}",
                        fromCurrency, toCurrency, effectiveDate);
            }

            exchangeRateEntity = exchangeRateRepository.save(exchangeRateEntity);
            ExchangeRateOpenApiDto response = exchangeRateMapper.toExchangeRate(exchangeRateEntity);

            return ResponseEntity.ok(response);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Métodos auxiliares
    public Currency findCurrencyByCode(String currencyCode) {
        return currencyRepository.findByCode(currencyCode)
                .orElseThrow(() -> new ResourceNotFoundException("Currency not found: " + currencyCode));
    }

    private ExchangeRate findLatestExchangeRate(Long fromCurrencyId, Long toCurrencyId) {
        List<ExchangeRate> rates = exchangeRateRepository.findLatestRateByFromCurrencyAndToCurrency(
                fromCurrencyId, toCurrencyId, LocalDate.now());

        if (rates.isEmpty()) {
            throw new ResourceNotFoundException(
                    "No exchange rate found for currencies with IDs: " + fromCurrencyId + " to " + toCurrencyId);
        }

        return rates.get(0);
    }

    public BigDecimal getExchangeRateValue(String fromCurrencyCode, String toCurrencyCode) {
        Currency fromCurrency = findCurrencyByCode(fromCurrencyCode);
        Currency toCurrency = findCurrencyByCode(toCurrencyCode);

        if (fromCurrency.getId().equals(toCurrency.getId())) {
            return BigDecimal.ONE;
        }

        ExchangeRate exchangeRate = findLatestExchangeRate(fromCurrency.getId(), toCurrency.getId());
        return exchangeRate.getRate();
    }
}
