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
 * ProductCreateOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("ProductCreate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class ProductCreateOpenApiDto {

  private String name;

  private String categoryName;

  private BigDecimal basePrice;

  private String baseCurrencyCode;

  private String description;

  private String kingdomName;

  public ProductCreateOpenApiDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductCreateOpenApiDto categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  @NotNull 
  @Schema(name = "categoryName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public ProductCreateOpenApiDto basePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * Get basePrice
   * @return basePrice
  */
  @NotNull @Valid 
  @Schema(name = "basePrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("basePrice")
  public BigDecimal getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public ProductCreateOpenApiDto baseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
    return this;
  }

  /**
   * Get baseCurrencyCode
   * @return baseCurrencyCode
  */
  @NotNull 
  @Schema(name = "baseCurrencyCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("baseCurrencyCode")
  public String getBaseCurrencyCode() {
    return baseCurrencyCode;
  }

  public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public ProductCreateOpenApiDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductCreateOpenApiDto kingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
    return this;
  }

  /**
   * Get kingdomName
   * @return kingdomName
  */
  
  @Schema(name = "kingdomName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kingdomName")
  public String getKingdomName() {
    return kingdomName;
  }

  public void setKingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreateOpenApiDto productCreate = (ProductCreateOpenApiDto) o;
    return Objects.equals(this.name, productCreate.name) &&
        Objects.equals(this.categoryName, productCreate.categoryName) &&
        Objects.equals(this.basePrice, productCreate.basePrice) &&
        Objects.equals(this.baseCurrencyCode, productCreate.baseCurrencyCode) &&
        Objects.equals(this.description, productCreate.description) &&
        Objects.equals(this.kingdomName, productCreate.kingdomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categoryName, basePrice, baseCurrencyCode, description, kingdomName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreateOpenApiDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    baseCurrencyCode: ").append(toIndentedString(baseCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kingdomName: ").append(toIndentedString(kingdomName)).append("\n");
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

