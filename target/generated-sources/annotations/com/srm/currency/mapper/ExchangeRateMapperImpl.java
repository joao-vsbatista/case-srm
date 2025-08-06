package com.srm.currency.mapper;

import com.srm.currency.entity.Currency;
import com.srm.currency.entity.ExchangeRate;
import com.srm.currency.model.generated.ExchangeRateOpenApiDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T15:55:01-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class ExchangeRateMapperImpl implements ExchangeRateMapper {

    @Override
    public ExchangeRateOpenApiDto toExchangeRate(ExchangeRate exchangeRate) {
        if ( exchangeRate == null ) {
            return null;
        }

        ExchangeRateOpenApiDto.ExchangeRateOpenApiDtoBuilder<?, ?> exchangeRateOpenApiDto = ExchangeRateOpenApiDto.builder();

        exchangeRateOpenApiDto.fromCurrencyCode( exchangeRateFromCurrencyCode( exchangeRate ) );
        exchangeRateOpenApiDto.toCurrencyCode( exchangeRateToCurrencyCode( exchangeRate ) );
        if ( exchangeRate.getId() != null ) {
            exchangeRateOpenApiDto.id( exchangeRate.getId().intValue() );
        }
        exchangeRateOpenApiDto.rate( exchangeRate.getRate() );
        exchangeRateOpenApiDto.effectiveDate( exchangeRate.getEffectiveDate() );

        return exchangeRateOpenApiDto.build();
    }

    @Override
    public List<ExchangeRateOpenApiDto> toListExchangeRate(List<ExchangeRate> exchangeRates) {
        if ( exchangeRates == null ) {
            return null;
        }

        List<ExchangeRateOpenApiDto> list = new ArrayList<ExchangeRateOpenApiDto>( exchangeRates.size() );
        for ( ExchangeRate exchangeRate : exchangeRates ) {
            list.add( toExchangeRate( exchangeRate ) );
        }

        return list;
    }

    private String exchangeRateFromCurrencyCode(ExchangeRate exchangeRate) {
        Currency fromCurrency = exchangeRate.getFromCurrency();
        if ( fromCurrency == null ) {
            return null;
        }
        return fromCurrency.getCode();
    }

    private String exchangeRateToCurrencyCode(ExchangeRate exchangeRate) {
        Currency toCurrency = exchangeRate.getToCurrency();
        if ( toCurrency == null ) {
            return null;
        }
        return toCurrency.getCode();
    }
}
