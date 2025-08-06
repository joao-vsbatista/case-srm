package com.srm.currency.repository;

import com.srm.currency.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    
    @Query("SELECT er FROM ExchangeRate er WHERE er.fromCurrency.id = :fromCurrencyId " +
           "AND er.toCurrency.id = :toCurrencyId AND er.effectiveDate = :date")
    Optional<ExchangeRate> findByFromCurrencyAndToCurrencyAndDate(
        @Param("fromCurrencyId") Long fromCurrencyId,
        @Param("toCurrencyId") Long toCurrencyId,
        @Param("date") LocalDate date
    );
    
    @Query("SELECT er FROM ExchangeRate er WHERE er.fromCurrency.id = :fromCurrencyId " +
           "AND er.toCurrency.id = :toCurrencyId AND er.effectiveDate <= :date " +
           "ORDER BY er.effectiveDate DESC")
    List<ExchangeRate> findLatestRateByFromCurrencyAndToCurrency(
        @Param("fromCurrencyId") Long fromCurrencyId,
        @Param("toCurrencyId") Long toCurrencyId,
        @Param("date") LocalDate date
    );
    
    List<ExchangeRate> findByEffectiveDateBetween(LocalDate startDate, LocalDate endDate);
}
