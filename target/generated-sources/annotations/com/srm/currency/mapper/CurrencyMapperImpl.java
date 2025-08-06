package com.srm.currency.mapper;

import com.srm.currency.entity.Currency;
import com.srm.currency.model.generated.CurrencySimpleOpenApiDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T15:54:54-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class CurrencyMapperImpl implements CurrencyMapper {

    @Override
    public CurrencySimpleOpenApiDto toCurrencySimple(Currency currency) {
        if ( currency == null ) {
            return null;
        }

        CurrencySimpleOpenApiDto.CurrencySimpleOpenApiDtoBuilder<?, ?> currencySimpleOpenApiDto = CurrencySimpleOpenApiDto.builder();

        currencySimpleOpenApiDto.id( currency.getId() );
        currencySimpleOpenApiDto.code( currency.getCode() );
        currencySimpleOpenApiDto.name( currency.getName() );
        currencySimpleOpenApiDto.symbol( currency.getSymbol() );
        currencySimpleOpenApiDto.isBaseCurrency( currency.getIsBaseCurrency() );

        return currencySimpleOpenApiDto.build();
    }

    @Override
    public List<CurrencySimpleOpenApiDto> toListCurrencySimple(List<Currency> currency) {
        if ( currency == null ) {
            return null;
        }

        List<CurrencySimpleOpenApiDto> list = new ArrayList<CurrencySimpleOpenApiDto>( currency.size() );
        for ( Currency currency1 : currency ) {
            list.add( toCurrencySimple( currency1 ) );
        }

        return list;
    }
}
