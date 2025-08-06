package com.srm.currency.model.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ProductSimpleOpenApiDto
 */
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@JsonTypeName("ProductSimple")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-06T15:54:51.646202200-03:00[America/Sao_Paulo]")
public class ProductSimpleOpenApiDto {

  private Long id;

  private String name;

  private String description;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryNameEnum categoryName;

  private BigDecimal categoryMultiplier;

  private BigDecimal basePrice;

  private String baseCurrencyCode;

  private String baseCurrencySymbol;

  private String kingdomName;

  public ProductSimpleOpenApiDto id(Long id) {
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

  public ProductSimpleOpenApiDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Pele de Urso das Montanhas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSimpleOpenApiDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Pele resistente de urso das montanhas geladas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSimpleOpenApiDto categoryName(CategoryNameEnum categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  
  @Schema(name = "categoryName", example = "Peles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryName")
  public CategoryNameEnum getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(CategoryNameEnum categoryName) {
    this.categoryName = categoryName;
  }

  public ProductSimpleOpenApiDto categoryMultiplier(BigDecimal categoryMultiplier) {
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

  public ProductSimpleOpenApiDto basePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * Get basePrice
   * @return basePrice
  */
  @Valid 
  @Schema(name = "basePrice", example = "50.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("basePrice")
  public BigDecimal getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public ProductSimpleOpenApiDto baseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
    return this;
  }

  /**
   * Get baseCurrencyCode
   * @return baseCurrencyCode
  */
  
  @Schema(name = "baseCurrencyCode", example = "OR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseCurrencyCode")
  public String getBaseCurrencyCode() {
    return baseCurrencyCode;
  }

  public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public ProductSimpleOpenApiDto baseCurrencySymbol(String baseCurrencySymbol) {
    this.baseCurrencySymbol = baseCurrencySymbol;
    return this;
  }

  /**
   * Get baseCurrencySymbol
   * @return baseCurrencySymbol
  */
  
  @Schema(name = "baseCurrencySymbol", example = "⚜", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseCurrencySymbol")
  public String getBaseCurrencySymbol() {
    return baseCurrencySymbol;
  }

  public void setBaseCurrencySymbol(String baseCurrencySymbol) {
    this.baseCurrencySymbol = baseCurrencySymbol;
  }

  public ProductSimpleOpenApiDto kingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
    return this;
  }

  /**
   * Get kingdomName
   * @return kingdomName
  */
  
  @Schema(name = "kingdomName", example = "Montanhas dos Anões", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProductSimpleOpenApiDto productSimple = (ProductSimpleOpenApiDto) o;
    return Objects.equals(this.id, productSimple.id) &&
        Objects.equals(this.name, productSimple.name) &&
        Objects.equals(this.description, productSimple.description) &&
        Objects.equals(this.categoryName, productSimple.categoryName) &&
        Objects.equals(this.categoryMultiplier, productSimple.categoryMultiplier) &&
        Objects.equals(this.basePrice, productSimple.basePrice) &&
        Objects.equals(this.baseCurrencyCode, productSimple.baseCurrencyCode) &&
        Objects.equals(this.baseCurrencySymbol, productSimple.baseCurrencySymbol) &&
        Objects.equals(this.kingdomName, productSimple.kingdomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, categoryName, categoryMultiplier, basePrice, baseCurrencyCode, baseCurrencySymbol, kingdomName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSimpleOpenApiDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryMultiplier: ").append(toIndentedString(categoryMultiplier)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    baseCurrencyCode: ").append(toIndentedString(baseCurrencyCode)).append("\n");
    sb.append("    baseCurrencySymbol: ").append(toIndentedString(baseCurrencySymbol)).append("\n");
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

