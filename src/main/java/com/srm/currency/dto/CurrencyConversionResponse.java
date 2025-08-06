package com.srm.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversionResponse {
    private String fromCurrencyCode;
    private String fromCurrencyName;
    private String fromCurrencySymbol;
    private String toCurrencyCode;
    private String toCurrencyName;
    private String toCurrencySymbol;
    private BigDecimal originalAmount;
    private BigDecimal convertedAmount;
    private BigDecimal exchangeRate;
    private BigDecimal categoryMultiplier;
    private String productName;
    private String categoryName;
    private LocalDateTime conversionDate;
    private String notes;
}
