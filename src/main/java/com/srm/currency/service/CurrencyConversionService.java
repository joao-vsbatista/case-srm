package com.srm.currency.service;


import com.srm.currency.api.generated.CurrenciesApi;
import com.srm.currency.dto.CurrencyConversionRequest;
import com.srm.currency.dto.CurrencyConversionResponse;
import com.srm.currency.entity.Currency;
import com.srm.currency.entity.Product;
import com.srm.currency.entity.Transaction;
import com.srm.currency.exception.ResourceNotFoundException;
import com.srm.currency.mapper.CurrencyMapper;
import com.srm.currency.model.generated.CurrencyConversionResponseOpenApiDto;
import com.srm.currency.model.generated.CurrencySimpleOpenApiDto;
import com.srm.currency.repository.CurrencyRepository;
import com.srm.currency.repository.ProductRepository;
import com.srm.currency.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyConversionService implements CurrenciesApi {

    private final ExchangeRateService exchangeRateService;
    private final CurrencyRepository currencyRepository;
    private final ProductRepository productRepository;
    private final TransactionRepository transactionRepository;
    private final CurrencyMapper currencyMapper;
    private Currency findCurrencyByCode(String currencyCode) {
        return currencyRepository.findByCode(currencyCode)
                .orElseThrow(() -> new ResourceNotFoundException("Currency not found: " + currencyCode));
    }

    @Override
    public ResponseEntity<List<CurrencySimpleOpenApiDto>> getAllCurrencies() {
        List<Currency> listaDeCurrency = currencyRepository.findAll();
        List<CurrencySimpleOpenApiDto> listaFinal = currencyMapper.toListCurrencySimple(listaDeCurrency);
        return ResponseEntity.ok(listaFinal);
    }
}
