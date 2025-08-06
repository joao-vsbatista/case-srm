package com.srm.currency.mapper;
import com.srm.currency.entity.ExchangeRate;
import com.srm.currency.model.generated.ExchangeRateOpenApiDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExchangeRateMapper {

    @Mapping(source = "fromCurrency.code", target = "fromCurrencyCode")
    @Mapping(source = "toCurrency.code", target = "toCurrencyCode")
    ExchangeRateOpenApiDto toExchangeRate(ExchangeRate exchangeRate);

    List<ExchangeRateOpenApiDto> toListExchangeRate(List<com.srm.currency.entity.ExchangeRate> exchangeRates);
}
