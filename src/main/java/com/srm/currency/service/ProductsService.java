package com.srm.currency.service;

import com.srm.currency.api.generated.ProductsApi;
import com.srm.currency.entity.Currency;
import com.srm.currency.entity.Kingdom;
import com.srm.currency.entity.Product;
import com.srm.currency.entity.ProductCategory;
import com.srm.currency.exception.ResourceNotFoundException;
import com.srm.currency.mapper.ProductMapper;
import com.srm.currency.model.generated.ProductCreateOpenApiDto;
import com.srm.currency.model.generated.ProductSimpleOpenApiDto;
import com.srm.currency.repository.KingdomRepository;
import com.srm.currency.repository.ProductCategoryRepository;
import com.srm.currency.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductsService implements ProductsApi {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ExchangeRateService exchangeRateService;
    private final ProductCategoryRepository productCategoryRepository;
    private final KingdomRepository kingdomRepository;

    @Override
    public ResponseEntity<Void> createProduct(ProductCreateOpenApiDto productCreate) {
        Product product = productMapper.toProduct(productCreate);
        Currency currency = exchangeRateService.findCurrencyByCode(productCreate.getBaseCurrencyCode());
        ProductCategory productCategory = productCategoryRepository.findByName(productCreate.getCategoryName());
        Kingdom kingdom = kingdomRepository.findByName(productCreate.getKingdomName());
        product.setBaseCurrency(currency);
        product.setCategory(productCategory);
        product.setKingdom(kingdom);
        productRepository.save(product);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<ProductSimpleOpenApiDto>> getAllProducts() {
        List<Product> listaDeProdutos = productRepository.findAll();
        List<ProductSimpleOpenApiDto> listaFinal = productMapper.toListProductSimple(listaDeProdutos);
        return ResponseEntity.ok(listaFinal);
    }

    @Override
    public ResponseEntity<ProductSimpleOpenApiDto> getProductById(Long id) {
        try {
            Product product = productRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));

            ProductSimpleOpenApiDto productSimple = productMapper.toProductSimple(product);
            return ResponseEntity.ok(productSimple);

        } catch (ResourceNotFoundException e) {
            log.error("Product not found: {}", id);
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            log.error("Error getting product by id {}: {}", id, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
