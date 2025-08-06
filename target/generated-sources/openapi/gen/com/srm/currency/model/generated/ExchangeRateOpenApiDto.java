package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExchangeRateOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("ExchangeRate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class ExchangeRateOpenApiDto {

  private Integer id;

  private String fromCurrencyCode;

  private String fromCurrencyName;

  private String toCurrencyCode;

  private String toCurrencyName;

  private BigDecimal rate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate effectiveDate;

  public ExchangeRateOpenApiDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExchangeRateOpenApiDto fromCurrencyCode(String fromCurrencyCode) {
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

  public ExchangeRateOpenApiDto fromCurrencyName(String fromCurrencyName) {
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

  public ExchangeRateOpenApiDto toCurrencyCode(String toCurrencyCode) {
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

  public ExchangeRateOpenApiDto toCurrencyName(String toCurrencyName) {
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

  public ExchangeRateOpenApiDto rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  @Valid 
  @Schema(name = "rate", example = "2.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public ExchangeRateOpenApiDto effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  */
  @Valid 
  @Schema(name = "effectiveDate", example = "Wed Jan 29 21:00:00 BRT 2025", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateOpenApiDto exchangeRate = (ExchangeRateOpenApiDto) o;
    return Objects.equals(this.id, exchangeRate.id) &&
        Objects.equals(this.fromCurrencyCode, exchangeRate.fromCurrencyCode) &&
        Objects.equals(this.fromCurrencyName, exchangeRate.fromCurrencyName) &&
        Objects.equals(this.toCurrencyCode, exchangeRate.toCurrencyCode) &&
        Objects.equals(this.toCurrencyName, exchangeRate.toCurrencyName) &&
        Objects.equals(this.rate, exchangeRate.rate) &&
        Objects.equals(this.effectiveDate, exchangeRate.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromCurrencyCode, fromCurrencyName, toCurrencyCode, toCurrencyName, rate, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateOpenApiDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromCurrencyCode: ").append(toIndentedString(fromCurrencyCode)).append("\n");
    sb.append("    fromCurrencyName: ").append(toIndentedString(fromCurrencyName)).append("\n");
    sb.append("    toCurrencyCode: ").append(toIndentedString(toCurrencyCode)).append("\n");
    sb.append("    toCurrencyName: ").append(toIndentedString(toCurrencyName)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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

