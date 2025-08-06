package com.srm.currency.mapper;

import com.srm.currency.entity.Product;
import com.srm.currency.model.generated.ProductCreateOpenApiDto;
import com.srm.currency.model.generated.ProductSimpleOpenApiDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductSimpleOpenApiDto toProductSimple(Product product);

    List<ProductSimpleOpenApiDto> toListProductSimple(List<Product> products);

    @Mapping(target = "baseCurrency.code", source = "baseCurrencyCode")
    Product toProduct(ProductCreateOpenApiDto productCreateOpenApiDto);

    ProductCreateOpenApiDto toProductCreate(Product product);

}
