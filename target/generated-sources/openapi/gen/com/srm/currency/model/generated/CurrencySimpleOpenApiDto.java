package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CurrencySimpleOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("CurrencySimple")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class CurrencySimpleOpenApiDto {

  private Long id;

  private String code;

  private String name;

  private String symbol;

  private String kingdomName;

  private Boolean isBaseCurrency;

  public CurrencySimpleOpenApiDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CurrencySimpleOpenApiDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", example = "OR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CurrencySimpleOpenApiDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Ouro Real", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencySimpleOpenApiDto symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  */
  
  @Schema(name = "symbol", example = "⚜", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CurrencySimpleOpenApiDto kingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
    return this;
  }

  /**
   * Get kingdomName
   * @return kingdomName
  */
  
  @Schema(name = "kingdomName", example = "SRM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kingdomName")
  public String getKingdomName() {
    return kingdomName;
  }

  public void setKingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
  }

  public CurrencySimpleOpenApiDto isBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
    return this;
  }

  /**
   * Get isBaseCurrency
   * @return isBaseCurrency
  */
  
  @Schema(name = "isBaseCurrency", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBaseCurrency")
  public Boolean isIsBaseCurrency() {
    return isBaseCurrency;
  }

  public void setIsBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencySimpleOpenApiDto currencySimple = (CurrencySimpleOpenApiDto) o;
    return Objects.equals(this.id, currencySimple.id) &&
        Objects.equals(this.code, currencySimple.code) &&
        Objects.equals(this.name, currencySimple.name) &&
        Objects.equals(this.symbol, currencySimple.symbol) &&
        Objects.equals(this.kingdomName, currencySimple.kingdomName) &&
        Objects.equals(this.isBaseCurrency, currencySimple.isBaseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, symbol, kingdomName, isBaseCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencySimpleOpenApiDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    kingdomName: ").append(toIndentedString(kingdomName)).append("\n");
    sb.append("    isBaseCurrency: ").append(toIndentedString(isBaseCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

