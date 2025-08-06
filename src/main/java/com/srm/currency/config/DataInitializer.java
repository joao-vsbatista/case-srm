package com.srm.currency.config;

import com.srm.currency.entity.*;
import com.srm.currency.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {
    
    private final KingdomRepository kingdomRepository;
    private final CurrencyRepository currencyRepository;
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductRepository productRepository;
    private final ExchangeRateRepository exchangeRateRepository;
    private final TransactionRepository transactionRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (kingdomRepository.count() == 0) {
            log.info("Inicializando dados do sistema SRM...");
            initializeData();
            log.info("Dados inicializados com sucesso!");
        } else {
            log.info("Dados já existem no banco, pulando inicialização.");
        }
    }

    private void initializeData() {
        Kingdom srmKingdom = Kingdom.builder()
            .name("SRM")
            .description("Reino antigo onde magia e comércio caminham lado a lado")
            .build();
        srmKingdom = kingdomRepository.save(srmKingdom);

        Kingdom dwarfKingdom = Kingdom.builder()
            .name("Montanhas dos Anões")
            .description("Reino montanhoso habitado pelos anões comerciantes")
            .build();
        dwarfKingdom = kingdomRepository.save(dwarfKingdom);

        Kingdom distantLands = Kingdom.builder()
            .name("Terras Distantes")
            .description("Reinos visitantes do mercado")
            .build();
        distantLands = kingdomRepository.save(distantLands);

        log.info("Reinos criados: SRM, Montanhas dos Anões, Terras Distantes");

        Currency ouroReal = Currency.builder()
            .id(1l)
            .code("OR")
            .name("Ouro Real")
            .symbol("⚜")
            .kingdom(srmKingdom)
            .isBaseCurrency(true)
            .build();
        ouroReal = currencyRepository.save(ouroReal);

        Currency tibar = Currency.builder()
            .code("TB")
            .name("Tibar")
            .symbol("⛏")
            .kingdom(dwarfKingdom)
            .isBaseCurrency(false)
            .build();
        tibar = currencyRepository.save(tibar);

        log.info("Moedas criadas: OR (Ouro Real), TB (Tibar)");

        ProductCategory peles = ProductCategory.builder()
            .name("Peles")
            .description("Peles de animais raros e comuns")
            .conversionMultiplier(new BigDecimal("1.0000"))
            .build();
        peles = productCategoryRepository.save(peles);

        ProductCategory madeira = ProductCategory.builder()
            .name("Madeira")
            .description("Madeiras nobres e comuns")
            .conversionMultiplier(new BigDecimal("0.8500"))
            .build();
        madeira = productCategoryRepository.save(madeira);

        ProductCategory hidromel = ProductCategory.builder()
            .name("Hidromel")
            .description("Bebidas fermentadas e destilados")
            .conversionMultiplier(new BigDecimal("1.2000"))
            .build();
        hidromel = productCategoryRepository.save(hidromel);

        log.info("Categorias criadas: Peles (1.0), Madeira (0.85), Hidromel (1.2)");

        Product peleUrso = Product.builder()
            .name("Pele de Urso das Montanhas")
            .description("Pele resistente de urso das montanhas geladas")
            .category(peles)
            .basePrice(new BigDecimal("50.0000"))
            .baseCurrency(ouroReal)
            .kingdom(dwarfKingdom)
            .build();
        productRepository.save(peleUrso);

        Product peleLoboBranco = Product.builder()
            .name("Pele de Lobo Branco")
            .description("Pele macia de lobo das planícies nevadas")
            .category(peles)
            .basePrice(new BigDecimal("35.0000"))
            .baseCurrency(ouroReal)
            .kingdom(srmKingdom)
            .build();
        productRepository.save(peleLoboBranco);

        Product madeiraElfica = Product.builder()
            .name("Madeira de Carvalho Élfico")
            .description("Madeira mágica com propriedades especiais")
            .category(madeira)
            .basePrice(new BigDecimal("75.0000"))
            .baseCurrency(ouroReal)
            .kingdom(srmKingdom)
            .build();
        productRepository.save(madeiraElfica);

        Product madeiraCerejeira = Product.builder()
            .name("Madeira de Cerejeira Ancestral")
            .description("Madeira avermelhada de árvores centenárias")
            .category(madeira)
            .basePrice(new BigDecimal("60.0000"))
            .baseCurrency(tibar)
            .kingdom(dwarfKingdom)
            .build();
        productRepository.save(madeiraCerejeira);

        Product hidromelAnaes = Product.builder()
            .name("Hidromel dos Anões")
            .description("Bebida tradicional dos anões das montanhas")
            .category(hidromel)
            .basePrice(new BigDecimal("25.0000"))
            .baseCurrency(tibar)
            .kingdom(dwarfKingdom)
            .build();
        productRepository.save(hidromelAnaes);

        Product hidromelReal = Product.builder()
            .name("Hidromel Real")
            .description("Hidromel especial servido na corte do Reino SRM")
            .category(hidromel)
            .basePrice(new BigDecimal("40.0000"))
            .baseCurrency(ouroReal)
            .kingdom(srmKingdom)
            .build();
        productRepository.save(hidromelReal);

        log.info("Produtos criados: 6 produtos distribuídos nas 3 categorias");

        ExchangeRate orToTb = ExchangeRate.builder()
            .fromCurrency(ouroReal)
            .toCurrency(tibar)
            .rate(new BigDecimal("2.5000"))
            .effectiveDate(LocalDate.now())
            .build();
        exchangeRateRepository.save(orToTb);

        ExchangeRate tbToOr = ExchangeRate.builder()
            .fromCurrency(tibar)
            .toCurrency(ouroReal)
            .rate(new BigDecimal("0.4000"))
            .effectiveDate(LocalDate.now())
            .build();
        exchangeRateRepository.save(tbToOr);

        Transaction transaction = Transaction.builder()
            .product(Product.builder().id(1l).build())
            .quantity(1l)
            .fromCurrency(Currency.builder().id(1l).build())
            .toCurrency(Currency.builder().id(2l).build())
            .originalAmount(1l)
            .convertedAmount(1l)
            .exchangeRate(2l)
            .fromKingdom(Kingdom.builder().id(1l).build())
            .toKingdom(Kingdom.builder().id(2l).build())
            .build();
        transactionRepository.save(transaction);

        log.info("Taxas de câmbio criadas: 1 OR = 2.5 TB, 1 TB = 0.4 OR");

        log.info("=== DADOS INICIAIS CRIADOS COM SUCESSO ===");
        log.info("Moedas disponíveis:");
        log.info("- OR (Ouro Real) - Reino SRM");
        log.info("- TB (Tibar) - Montanhas dos Anões");
        log.info("Taxa atual: 1 OR = 2.5 TB");
        log.info("Categorias de produtos:");
        log.info("- Peles (Multiplicador: 1.0)");
        log.info("- Madeira (Multiplicador: 0.85)");
        log.info("- Hidromel (Multiplicador: 1.2)");
        log.info("Produtos disponíveis: IDs 1-6 distribuídos nas 3 categorias");
    }
}
