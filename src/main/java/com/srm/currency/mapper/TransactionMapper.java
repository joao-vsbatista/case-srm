package com.srm.currency.mapper;

import com.srm.currency.entity.Currency;
import com.srm.currency.entity.Transaction;
import com.srm.currency.model.generated.CurrencySimpleOpenApiDto;
import com.srm.currency.model.generated.TransactionOpenApiDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
     TransactionOpenApiDto toTranscationPageOpenApiDto(Transaction transaction);

    List<TransactionOpenApiDto> toListTransactionPageOpenApiDto(List<Transaction> transaction);
}
