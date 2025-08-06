package com.srm.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private String categoryName;
    private BigDecimal basePrice;
    private String baseCurrencyCode;
    private String baseCurrencySymbol;
    private String kingdomName;
    private BigDecimal categoryMultiplier;
}
