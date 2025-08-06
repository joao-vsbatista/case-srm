package com.srm.currency.service;

import com.srm.currency.api.generated.TransactionsApi;
import com.srm.currency.dto.TransactionFilterRequest;
import com.srm.currency.entity.Currency;
import com.srm.currency.entity.Kingdom;
import com.srm.currency.entity.Transaction;
import com.srm.currency.mapper.TransactionMapper;
import com.srm.currency.model.generated.TransactionCreateOpenApiDto;
import com.srm.currency.model.generated.TransactionOpenApiDto;
import com.srm.currency.repository.CurrencyRepository;
import com.srm.currency.repository.KingdomRepository;
import com.srm.currency.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionService implements TransactionsApi {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public ResponseEntity<TransactionOpenApiDto> createTransaction(TransactionCreateOpenApiDto transactionCreate) {
        return TransactionsApi.super.createTransaction(transactionCreate);
    }

    @Override
    public ResponseEntity<List<TransactionOpenApiDto>> listTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        List<TransactionOpenApiDto> listaFinal = transactionMapper.toListTransactionPageOpenApiDto(transactions);
        return ResponseEntity.ok(listaFinal);
    }
//    private final TransactionRepository transactionRepository;
//    private final CurrencyRepository currencyRepository;
//    private final KingdomRepository kingdomRepository;
//
//    @Transactional(readOnly = true)
//    public Page<Transaction> findTransactionsWithFilters(TransactionFilterRequest filterRequest) {
//
//        Long fromCurrencyId = null;
//        Long toCurrencyId = null;
//        Long fromKingdomId = null;
//        Long toKingdomId = null;
//
//        if (filterRequest.getFromCurrencyCode() != null) {
//            Currency fromCurrency = currencyRepository.findByCode(filterRequest.getFromCurrencyCode())
//                .orElse(null);
//            if (fromCurrency != null) {
//                fromCurrencyId = fromCurrency.getId();
//            }
//        }
//
//        if (filterRequest.getToCurrencyCode() != null) {
//            Currency toCurrency = currencyRepository.findByCode(filterRequest.getToCurrencyCode())
//                .orElse(null);
//            if (toCurrency != null) {
//                toCurrencyId = toCurrency.getId();
//            }
//        }
//
//        if (filterRequest.getFromKingdomName() != null) {
//            Kingdom fromKingdom = kingdomRepository.findByName(filterRequest.getFromKingdomName())
//                .orElse(null);
//            if (fromKingdom != null) {
//                fromKingdomId = fromKingdom.getId();
//            }
//        }
//
//        if (filterRequest.getToKingdomName() != null) {
//            Kingdom toKingdom = kingdomRepository.findByName(filterRequest.getToKingdomName())
//                .orElse(null);
//            if (toKingdom != null) {
//                toKingdomId = toKingdom.getId();
//            }
//        }
//
//        Sort.Direction direction = "ASC".equalsIgnoreCase(filterRequest.getSortDirection())
//            ? Sort.Direction.ASC : Sort.Direction.DESC;
//        Sort sort = Sort.by(direction, filterRequest.getSortBy());
//        Pageable pageable = PageRequest.of(filterRequest.getPage(), filterRequest.getSize(), sort);
//
//        log.info("Searching transactions with filters: fromCurrency={}, toCurrency={}, fromKingdom={}, toKingdom={}, type={}, status={}",
//                filterRequest.getFromCurrencyCode(), filterRequest.getToCurrencyCode(),
//                filterRequest.getFromKingdomName(), filterRequest.getToKingdomName(),
//                filterRequest.getTransactionType(), filterRequest.getStatus());
//
//        return transactionRepository.findTransactionsWithFilters(
//            fromCurrencyId, toCurrencyId, fromKingdomId, toKingdomId,
//            filterRequest.getTransactionType(), filterRequest.getStatus(),
//            filterRequest.getStartDate(), filterRequest.getEndDate(),
//            pageable
//        );
//    }
//
//    @Transactional(readOnly = true)
//    public Transaction findById(Long id) {
//        return transactionRepository.findById(id)
//            .orElseThrow(() -> new RuntimeException("Transaction not found: " + id));
//    }
}
