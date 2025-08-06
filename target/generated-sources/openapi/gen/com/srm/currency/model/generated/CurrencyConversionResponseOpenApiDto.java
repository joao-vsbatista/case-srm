package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * CurrencyConversionResponseOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("CurrencyConversionResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class CurrencyConversionResponseOpenApiDto {

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

  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  /**
   * Gets or Sets categoryName
   */
  public enum CategoryNameEnum {
    PELES("Peles"),
    
    MADEIRA("Madeira"),
    
    HIDROMEL("Hidromel");

    private String value;

    CategoryNameEnum(String value) {
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
    public static CategoryNameEnum fromValue(String value) {
      for (CategoryNameEnum b : CategoryNameEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<CategoryNameEnum> categoryName = JsonNullable.<CategoryNameEnum>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime conversionDate;

  private String notes;

  public CurrencyConversionResponseOpenApiDto fromCurrencyCode(String fromCurrencyCode) {
    this.fromCurrencyCode = fromCurrencyCode;
    return this;
  }

  /**
   * Get fromCurrencyCode
   * @return fromCurrencyCode
  */
  
  @Schema(name = "fromCurrencyCode", example = "OR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromCurrencyCode")
  public String getFromCurrencyCode() {
    return fromCurrencyCode;
  }

  public void setFromCurrencyCode(String fromCurrencyCode) {
    this.fromCurrencyCode = fromCurrencyCode;
  }

  public CurrencyConversionResponseOpenApiDto fromCurrencyName(String fromCurrencyName) {
    this.fromCurrencyName = fromCurrencyName;
    return this;
  }

  /**
   * Get fromCurrencyName
   * @return fromCurrencyName
  */
  
  @Schema(name = "fromCurrencyName", example = "Ouro Real", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromCurrencyName")
  public String getFromCurrencyName() {
    return fromCurrencyName;
  }

  public void setFromCurrencyName(String fromCurrencyName) {
    this.fromCurrencyName = fromCurrencyName;
  }

  public CurrencyConversionResponseOpenApiDto fromCurrencySymbol(String fromCurrencySymbol) {
    this.fromCurrencySymbol = fromCurrencySymbol;
    return this;
  }

  /**
   * Get fromCurrencySymbol
   * @return fromCurrencySymbol
  */
  
  @Schema(name = "fromCurrencySymbol", example = "⚜", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromCurrencySymbol")
  public String getFromCurrencySymbol() {
    return fromCurrencySymbol;
  }

  public void setFromCurrencySymbol(String fromCurrencySymbol) {
    this.fromCurrencySymbol = fromCurrencySymbol;
  }

  public CurrencyConversionResponseOpenApiDto toCurrencyCode(String toCurrencyCode) {
    this.toCurrencyCode = toCurrencyCode;
    return this;
  }

  /**
   * Get toCurrencyCode
   * @return toCurrencyCode
  */
  
  @Schema(name = "toCurrencyCode", example = "TB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toCurrencyCode")
  public String getToCurrencyCode() {
    return toCurrencyCode;
  }

  public void setToCurrencyCode(String toCurrencyCode) {
    this.toCurrencyCode = toCurrencyCode;
  }

  public CurrencyConversionResponseOpenApiDto toCurrencyName(String toCurrencyName) {
    this.toCurrencyName = toCurrencyName;
    return this;
  }

  /**
   * Get toCurrencyName
   * @return toCurrencyName
  */
  
  @Schema(name = "toCurrencyName", example = "Tibar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toCurrencyName")
  public String getToCurrencyName() {
    return toCurrencyName;
  }

  public void setToCurrencyName(String toCurrencyName) {
    this.toCurrencyName = toCurrencyName;
  }

  public CurrencyConversionResponseOpenApiDto toCurrencySymbol(String toCurrencySymbol) {
    this.toCurrencySymbol = toCurrencySymbol;
    return this;
  }

  /**
   * Get toCurrencySymbol
   * @return toCurrencySymbol
  */
  
  @Schema(name = "toCurrencySymbol", example = "⛏", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toCurrencySymbol")
  public String getToCurrencySymbol() {
    return toCurrencySymbol;
  }

  public void setToCurrencySymbol(String toCurrencySymbol) {
    this.toCurrencySymbol = toCurrencySymbol;
  }

  public CurrencyConversionResponseOpenApiDto originalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * Get originalAmount
   * @return originalAmount
  */
  @Valid 
  @Schema(name = "originalAmount", example = "100.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalAmount")
  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }

  public CurrencyConversionResponseOpenApiDto convertedAmount(BigDecimal convertedAmount) {
    this.convertedAmount = convertedAmount;
    return this;
  }

  /**
   * Get convertedAmount
   * @return convertedAmount
  */
  @Valid 
  @Schema(name = "convertedAmount", example = "250.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("convertedAmount")
  public BigDecimal getConvertedAmount() {
    return convertedAmount;
  }

  public void setConvertedAmount(BigDecimal convertedAmount) {
    this.convertedAmount = convertedAmount;
  }

  public CurrencyConversionResponseOpenApiDto exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
   * @return exchangeRate
  */
  @Valid 
  @Schema(name = "exchangeRate", example = "2.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public CurrencyConversionResponseOpenApiDto categoryMultiplier(BigDecimal categoryMultiplier) {
    this.categoryMultiplier = categoryMultiplier;
    return this;
  }

  /**
   * Get categoryMultiplier
   * @return categoryMultiplier
  */
  @Valid 
  @Schema(name = "categoryMultiplier", example = "1.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryMultiplier")
  public BigDecimal getCategoryMultiplier() {
    return categoryMultiplier;
  }

  public void setCategoryMultiplier(BigDecimal categoryMultiplier) {
    this.categoryMultiplier = categoryMultiplier;
  }

  public CurrencyConversionResponseOpenApiDto productName(String productName) {
    this.productName = JsonNullable.of(productName);
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "productName", example = "Pele de Urso das Montanhas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productName")
  public JsonNullable<String> getProductName() {
    return productName;
  }

  public void setProductName(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public CurrencyConversionResponseOpenApiDto categoryName(CategoryNameEnum categoryName) {
    this.categoryName = JsonNullable.of(categoryName);
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  
  @Schema(name = "categoryName", example = "Peles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryName")
  public JsonNullable<CategoryNameEnum> getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(JsonNullable<CategoryNameEnum> categoryName) {
    this.categoryName = categoryName;
  }

  public CurrencyConversionResponseOpenApiDto conversionDate(LocalDateTime conversionDate) {
    this.conversionDate = conversionDate;
    return this;
  }

  /**
   * Get conversionDate
   * @return conversionDate
  */
  @Valid 
  @Schema(name = "conversionDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionDate")
  public LocalDateTime getConversionDate() {
    return conversionDate;
  }

  public void setConversionDate(LocalDateTime conversionDate) {
    this.conversionDate = conversionDate;
  }

  public CurrencyConversionResponseOpenApiDto notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", example = "Taxa de câmbio: 2.5000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyConversionResponseOpenApiDto currencyConversionResponse = (CurrencyConversionResponseOpenApiDto) o;
    return Objects.equals(this.fromCurrencyCode, currencyConversionResponse.fromCurrencyCode) &&
        Objects.equals(this.fromCurrencyName, currencyConversionResponse.fromCurrencyName) &&
        Objects.equals(this.fromCurrencySymbol, currencyConversionResponse.fromCurrencySymbol) &&
        Objects.equals(this.toCurrencyCode, currencyConversionResponse.toCurrencyCode) &&
        Objects.equals(this.toCurrencyName, currencyConversionResponse.toCurrencyName) &&
        Objects.equals(this.toCurrencySymbol, currencyConversionResponse.toCurrencySymbol) &&
        Objects.equals(this.originalAmount, currencyConversionResponse.originalAmount) &&
        Objects.equals(this.convertedAmount, currencyConversionResponse.convertedAmount) &&
        Objects.equals(this.exchangeRate, currencyConversionResponse.exchangeRate) &&
        Objects.equals(this.categoryMultiplier, currencyConversionResponse.categoryMultiplier) &&
        equalsNullable(this.productName, currencyConversionResponse.productName) &&
        equalsNullable(this.categoryName, currencyConversionResponse.categoryName) &&
        Objects.equals(this.conversionDate, currencyConversionResponse.conversionDate) &&
        Objects.equals(this.notes, currencyConversionResponse.notes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCurrencyCode, fromCurrencyName, fromCurrencySymbol, toCurrencyCode, toCurrencyName, toCurrencySymbol, originalAmount, convertedAmount, exchangeRate, categoryMultiplier, hashCodeNullable(productName), hashCodeNullable(categoryName), conversionDate, notes);
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
    sb.append("class CurrencyConversionResponseOpenApiDto {\n");
    sb.append("    fromCurrencyCode: ").append(toIndentedString(fromCurrencyCode)).append("\n");
    sb.append("    fromCurrencyName: ").append(toIndentedString(fromCurrencyName)).append("\n");
    sb.append("    fromCurrencySymbol: ").append(toIndentedString(fromCurrencySymbol)).append("\n");
    sb.append("    toCurrencyCode: ").append(toIndentedString(toCurrencyCode)).append("\n");
    sb.append("    toCurrencyName: ").append(toIndentedString(toCurrencyName)).append("\n");
    sb.append("    toCurrencySymbol: ").append(toIndentedString(toCurrencySymbol)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    categoryMultiplier: ").append(toIndentedString(categoryMultiplier)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    conversionDate: ").append(toIndentedString(conversionDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

