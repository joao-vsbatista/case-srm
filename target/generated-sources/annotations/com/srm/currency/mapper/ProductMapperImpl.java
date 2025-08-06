package com.srm.currency.mapper;

import com.srm.currency.entity.Currency;
import com.srm.currency.entity.Product;
import com.srm.currency.model.generated.ProductCreateOpenApiDto;
import com.srm.currency.model.generated.ProductSimpleOpenApiDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T15:54:55-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductSimpleOpenApiDto toProductSimple(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductSimpleOpenApiDto.ProductSimpleOpenApiDtoBuilder<?, ?> productSimpleOpenApiDto = ProductSimpleOpenApiDto.builder();

        productSimpleOpenApiDto.id( product.getId() );
        productSimpleOpenApiDto.name( product.getName() );
        productSimpleOpenApiDto.description( product.getDescription() );
        productSimpleOpenApiDto.basePrice( product.getBasePrice() );

        return productSimpleOpenApiDto.build();
    }

    @Override
    public List<ProductSimpleOpenApiDto> toListProductSimple(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductSimpleOpenApiDto> list = new ArrayList<ProductSimpleOpenApiDto>( products.size() );
        for ( Product product : products ) {
            list.add( toProductSimple( product ) );
        }

        return list;
    }

    @Override
    public Product toProduct(ProductCreateOpenApiDto productCreateOpenApiDto) {
        if ( productCreateOpenApiDto == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.baseCurrency( productCreateOpenApiDtoToCurrency( productCreateOpenApiDto ) );
        product.name( productCreateOpenApiDto.getName() );
        product.description( productCreateOpenApiDto.getDescription() );
        product.basePrice( productCreateOpenApiDto.getBasePrice() );

        return product.build();
    }

    @Override
    public ProductCreateOpenApiDto toProductCreate(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateOpenApiDto.ProductCreateOpenApiDtoBuilder<?, ?> productCreateOpenApiDto = ProductCreateOpenApiDto.builder();

        productCreateOpenApiDto.name( product.getName() );
        productCreateOpenApiDto.basePrice( product.getBasePrice() );
        productCreateOpenApiDto.description( product.getDescription() );

        return productCreateOpenApiDto.build();
    }

    protected Currency productCreateOpenApiDtoToCurrency(ProductCreateOpenApiDto productCreateOpenApiDto) {
        if ( productCreateOpenApiDto == null ) {
            return null;
        }

        Currency.CurrencyBuilder currency = Currency.builder();

        currency.code( productCreateOpenApiDto.getBaseCurrencyCode() );

        return currency.build();
    }
}
