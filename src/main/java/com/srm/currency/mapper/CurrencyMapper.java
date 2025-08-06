package com.srm.currency.mapper;


import com.srm.currency.entity.Currency;
import com.srm.currency.model.generated.CurrencySimpleOpenApiDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import javax.swing.text.html.parser.ContentModel;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {

    CurrencySimpleOpenApiDto toCurrencySimple(Currency currency);

    List<CurrencySimpleOpenApiDto> toListCurrencySimple(List<Currency> currency);

}
