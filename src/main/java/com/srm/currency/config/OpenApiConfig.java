package com.srm.currency.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Sistema de Conversão de Moedas")
                .description("""
                    API REST para conversão de moedas com multiplicadores por categoria de produto.
                    
                    ## Funcionalidades:
                    - Conversão entre Ouro Real (OR) e Tibar (TB)
                    - Multiplicadores por categoria: Peles (1.0), Madeira (0.85), Hidromel (1.2)
                    - Histórico de transações com filtros avançados
                    - Taxas de câmbio atualizáveis
                    
                    ## Endpoints Principais:
                    - `POST /api/currencies/{from}/convert-to/{to}` - Conversão de moedas
                    - `GET /api/exchange-rates/{from}/to/{to}` - Consultar taxas
                    - `GET /api/system/status` - Status do sistema
                    """)
                .version("1.0.0"));
    }
}
