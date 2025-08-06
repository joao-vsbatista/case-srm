package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CurrencyConversionRequestOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("CurrencyConversionRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class CurrencyConversionRequestOpenApiDto {

  private String fromCurrencyCode;

  private String toCurrencyCode;

  private BigDecimal amount;

  private Long productId;

  private BigDecimal quantity;

  public CurrencyConversionRequestOpenApiDto fromCurrencyCode(String fromCurrencyCode) {
    this.fromCurrencyCode = fromCurrencyCode;
    return this;
  }

  /**
   * Get fromCurrencyCode
   * @return fromCurrencyCode
  */
  @NotNull 
  @Schema(name = "fromCurrencyCode", example = "OR", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fromCurrencyCode")
  public String getFromCurrencyCode() {
    return fromCurrencyCode;
  }

  public void setFromCurrencyCode(String fromCurrencyCode) {
    this.fromCurrencyCode = fromCurrencyCode;
  }

  public CurrencyConversionRequestOpenApiDto toCurrencyCode(String toCurrencyCode) {
    this.toCurrencyCode = toCurrencyCode;
    return this;
  }

  /**
   * Get toCurrencyCode
   * @return toCurrencyCode
  */
  @NotNull 
  @Schema(name = "toCurrencyCode", example = "TB", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toCurrencyCode")
  public String getToCurrencyCode() {
    return toCurrencyCode;
  }

  public void setToCurrencyCode(String toCurrencyCode) {
    this.toCurrencyCode = toCurrencyCode;
  }

  public CurrencyConversionRequestOpenApiDto amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 0.00010
   * @return amount
  */
  @NotNull @Valid @DecimalMin("0.00010") 
  @Schema(name = "amount", example = "100.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CurrencyConversionRequestOpenApiDto productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * minimum: 1
   * maximum: 6
   * @return productId
  */
  @Min(1L) @Max(6L) 
  @Schema(name = "productId", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public CurrencyConversionRequestOpenApiDto quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @Valid 
  @Schema(name = "quantity", example = "1.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyConversionRequestOpenApiDto currencyConversionRequest = (CurrencyConversionRequestOpenApiDto) o;
    return Objects.equals(this.fromCurrencyCode, currencyConversionRequest.fromCurrencyCode) &&
        Objects.equals(this.toCurrencyCode, currencyConversionRequest.toCurrencyCode) &&
        Objects.equals(this.amount, currencyConversionRequest.amount) &&
        Objects.equals(this.productId, currencyConversionRequest.productId) &&
        Objects.equals(this.quantity, currencyConversionRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCurrencyCode, toCurrencyCode, amount, productId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyConversionRequestOpenApiDto {\n");
    sb.append("    fromCurrencyCode: ").append(toIndentedString(fromCurrencyCode)).append("\n");
    sb.append("    toCurrencyCode: ").append(toIndentedString(toCurrencyCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

