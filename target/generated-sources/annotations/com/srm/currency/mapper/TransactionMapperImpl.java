package com.srm.currency.mapper;

import com.srm.currency.entity.Transaction;
import com.srm.currency.model.generated.TransactionOpenApiDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T15:54:55-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionOpenApiDto toTranscationPageOpenApiDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionOpenApiDto.TransactionOpenApiDtoBuilder<?, ?> transactionOpenApiDto = TransactionOpenApiDto.builder();

        transactionOpenApiDto.id( transaction.getId() );
        if ( transaction.getOriginalAmount() != null ) {
            transactionOpenApiDto.originalAmount( BigDecimal.valueOf( transaction.getOriginalAmount() ) );
        }
        if ( transaction.getConvertedAmount() != null ) {
            transactionOpenApiDto.convertedAmount( BigDecimal.valueOf( transaction.getConvertedAmount() ) );
        }
        if ( transaction.getExchangeRate() != null ) {
            transactionOpenApiDto.exchangeRate( BigDecimal.valueOf( transaction.getExchangeRate() ) );
        }
        transactionOpenApiDto.transactionDate( transaction.getTransactionDate() );

        return transactionOpenApiDto.build();
    }

    @Override
    public List<TransactionOpenApiDto> toListTransactionPageOpenApiDto(List<Transaction> transaction) {
        if ( transaction == null ) {
            return null;
        }

        List<TransactionOpenApiDto> list = new ArrayList<TransactionOpenApiDto>( transaction.size() );
        for ( Transaction transaction1 : transaction ) {
            list.add( toTranscationPageOpenApiDto( transaction1 ) );
        }

        return list;
    }
}
