package com.srm.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencySimpleDto {
    private Long id;
    private String code;
    private String name;
    private String symbol;
    private String kingdomName;
    private Boolean isBaseCurrency;
}
