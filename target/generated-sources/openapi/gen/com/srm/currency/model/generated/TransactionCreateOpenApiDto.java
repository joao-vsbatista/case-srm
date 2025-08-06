package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TransactionCreateOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("TransactionCreate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class TransactionCreateOpenApiDto {

  /**
   * Gets or Sets transactionType
   */
  public enum TransactionTypeEnum {
    EXCHANGE("EXCHANGE"),
    
    PURCHASE("PURCHASE"),
    
    SALE("SALE");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TransactionTypeEnum transactionType;

  private BigDecimal originalAmount;

  private BigDecimal convertedAmount;

  private BigDecimal exchangeRate;

  private JsonNullable<Long> productId = JsonNullable.<Long>undefined();

  public TransactionCreateOpenApiDto transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @NotNull 
  @Schema(name = "transactionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionType")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionCreateOpenApiDto originalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * Get originalAmount
   * @return originalAmount
  */
  @NotNull @Valid 
  @Schema(name = "originalAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("originalAmount")
  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }

  public TransactionCreateOpenApiDto convertedAmount(BigDecimal convertedAmount) {
    this.convertedAmount = convertedAmount;
    return this;
  }

  /**
   * Get convertedAmount
   * @return convertedAmount
  */
  @NotNull @Valid 
  @Schema(name = "convertedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("convertedAmount")
  public BigDecimal getConvertedAmount() {
    return convertedAmount;
  }

  public void setConvertedAmount(BigDecimal convertedAmount) {
    this.convertedAmount = convertedAmount;
  }

  public TransactionCreateOpenApiDto exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
   * @return exchangeRate
  */
  @NotNull @Valid 
  @Schema(name = "exchangeRate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public TransactionCreateOpenApiDto productId(Long productId) {
    this.productId = JsonNullable.of(productId);
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public JsonNullable<Long> getProductId() {
    return productId;
  }

  public void setProductId(JsonNullable<Long> productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCreateOpenApiDto transactionCreate = (TransactionCreateOpenApiDto) o;
    return Objects.equals(this.transactionType, transactionCreate.transactionType) &&
        Objects.equals(this.originalAmount, transactionCreate.originalAmount) &&
        Objects.equals(this.convertedAmount, transactionCreate.convertedAmount) &&
        Objects.equals(this.exchangeRate, transactionCreate.exchangeRate) &&
        equalsNullable(this.productId, transactionCreate.productId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, originalAmount, convertedAmount, exchangeRate, hashCodeNullable(productId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCreateOpenApiDto {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

