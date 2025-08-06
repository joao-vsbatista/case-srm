# Sistema de Conversão de Moedas do Reino SRM

## Contexto

Este sistema foi desenvolvido para resolver o desafio de conversão entre o **Ouro Real** e o **Tibar**.

## Funcionalidades

1. **Mapeamento de Moedas**: Sistema completo de taxas de câmbio com histórico
2. **Estratégia de Conversão de Produtos**: Multiplicadores personalizados por categoria
3. **API Interativa e Documentada**: API REST com Swagger/OpenAPI
4. **Script SQL**: Scripts de criação e população do banco de dados
5. **Persistência Resiliente**: Transações JPA para consistência
6. **Consultas Avançadas**: Filtros complexos no histórico de transações
7. **Modelagem do Banco de Dados**: Diagrama ER completo

## Arquitetura

### Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **H2 Database** (em memória para desenvolvimento)
- **Lombok** (redução de boilerplate)
- **SpringDoc OpenAPI** (documentação automática)
- **Maven** (gerenciamento de dependências)

### Estrutura do Projeto

\`\`\`
src/main/java/com/srm/currency/
├── entity/              # Entidades JPA
├── repository/          # Repositórios Spring Data
├── service/            # Lógica de negócio
├── controller/         # Controllers REST
├── dto/               # Data Transfer Objects
├── enums/             # Enumerações
├── exception/         # Tratamento de exceções
└── config/            # Configurações
\`\`\`

## Modelo de Dados

### Entidades Principais

- **Kingdom**: Reinos (SRM, Montanhas dos Anões)
- **Currency**: Moedas (Ouro Real, Tibar)
- **ProductCategory**: Categorias com multiplicadores de conversão
- **Product**: Produtos comercializados
- **ExchangeRate**: Taxas de câmbio históricas
- **Transaction**: Registro de todas as transações

### Relacionamentos

- Um Reino pode ter múltiplas Moedas
- Produtos pertencem a uma Categoria e um Reino
- Taxas de Câmbio são específicas por data
- Transações registram conversões completas

## Como Executar

### Pré-requisitos

- Java 17+
- Maven 3.6+

### Passos

1. **Clone o repositório**
git clone https://github.com/joao-vsbatista/case-srm
cd desafio_srm

2. **Execute a aplicação**
mvn spring-boot:run

3. **Acesse a documentação da API**
- Swagger UI: http://localhost:8080/srm-currency/swagger-ui.html

4. **Console do H2 Database**
- URL: http://localhost:8080/srm-currency/h2-console
- JDBC URL: `jdbc:h2:mem:srmdb`
- Username: `sa`
- Password: `password`

## Endpoints da API

### Sistema e Verificação

- `GET /api/system/status` - Status do sistema e contadores
- `GET /api/system/currencies` - Listar todas as moedas
- `GET /api/system/kingdoms` - Listar todos os reinos
- `GET /api/system/products` - Listar todos os produtos
- `GET /api/system/categories` - Listar todas as categorias

### Moedas

- `GET /api/currencies` - Listar todas as moedas
- `GET /api/currencies/{from}/rate-to/{to}` - Taxa de câmbio simples
- `POST /api/currencies/{from}/convert-to/{to}` - Converter moeda

### Taxas de Câmbio

- `GET /api/exchange-rates/{from}/to/{to}` - Taxa atual entre moedas
- `GET /api/exchange-rates/{from}/to/{to}/history` - Histórico de taxas
- `PUT /api/exchange-rates/{from}/to/{to}` - Atualizar taxa de câmbio

### Conversão de Moedas

- `POST /api/currency-conversion/convert` - Conversão completa com JSON

### Transações

- `GET /api/transactions` - Consultar transações com filtros
- `GET /api/transactions/{id}` - Detalhes de uma transação

## Exemplos de Uso

### 1. Verificar Status do Sistema

\`\`\=
curl -X GET "http://localhost:8080/srm-currency/api/system/status"
\`\`\`

**Resposta:**
\`\`\`json
{
  "system": "SRM Currency System",
  "status": "RUNNING",
  "dataLoaded": true,
  "counts": {
    "kingdoms": 3,
    "currencies": 2,
    "categories": 3,
    "products": 6
  }
}
\`\`\`

### 2. Listar Categorias Disponíveis

\`\`\`bash
curl -X GET "http://localhost:8080/srm-currency/api/system/categories"
\`\`\`

**Resposta:**
\`\`\`json
[
  {
    "id": 1,
    "name": "Peles",
    "description": "Peles de animais raros e comuns",
    "conversionMultiplier": 1.0000
  },
  {
    "id": 2,
    "name": "Madeira",
    "description": "Madeiras nobres e comuns",
    "conversionMultiplier": 0.8500
  },
  {
    "id": 3,
    "name": "Hidromel",
    "description": "Bebidas fermentadas e destilados",
    "conversionMultiplier": 1.2000
  }
]
\`\`\`

### 3. Listar Produtos por Categoria

\`\`\`bash
curl -X GET "http://localhost:8080/srm-currency/api/system/products"
\`\`\`

**Resposta (exemplo):**
\`\`\`json
[
  {
    "id": 1,
    "name": "Pele de Urso das Montanhas",
    "description": "Pele resistente de urso das montanhas geladas",
    "categoryName": "Peles",
    "categoryMultiplier": 1.0000,
    "basePrice": 50.0000,
    "baseCurrencyCode": "OR",
    "baseCurrencySymbol": "⚜",
    "kingdomName": "Montanhas dos Anões"
  },
  {
    "id": 3,
    "name": "Madeira de Carvalho Élfico",
    "description": "Madeira mágica com propriedades especiais",
    "categoryName": "Madeira",
    "categoryMultiplier": 0.8500,
    "basePrice": 75.0000,
    "baseCurrencyCode": "OR",
    "baseCurrencySymbol": "⚜",
    "kingdomName": "SRM"
  },
  {
    "id": 5,
    "name": "Hidromel dos Anões",
    "description": "Bebida tradicional dos anões das montanhas",
    "categoryName": "Hidromel",
    "categoryMultiplier": 1.2000,
    "basePrice": 25.0000,
    "baseCurrencyCode": "TB",
    "baseCurrencySymbol": "⛏",
    "kingdomName": "Montanhas dos Anões"
  }
]
\`\`\`

### 4. Conversão Simples

\`\`\`bash
curl -X POST "http://localhost:8080/srm-currency/api/currencies/OR/convert-to/TB?amount=100"
\`\`\`

**Resposta:**
\`\`\`json
{
  "fromCurrencyCode": "OR",
  "fromCurrencyName": "Ouro Real",
  "fromCurrencySymbol": "⚜",
  "toCurrencyCode": "TB",
  "toCurrencyName": "Tibar",
  "toCurrencySymbol": "⛏",
  "originalAmount": 100.0000,
  "convertedAmount": 250.0000,
  "exchangeRate": 2.5000,
  "categoryMultiplier": 1.0000,
  "productName": null,
  "categoryName": null,
  "conversionDate": "2025-01-30T01:32:15.123456",
  "notes": "Taxa de câmbio: 2.5000"
}
\`\`\`

### 5. Conversão com Produto - Categoria Peles (Multiplicador 1.0)

\`\`\`bash
curl -X POST "http://localhost:8080/srm-currency/api/currencies/OR/convert-to/TB?amount=50&productId=1&quantity=1"
\`\`\`

**Resultado:** 125.00 TB (50 × 2.5 × 1.0)

### 6. Conversão com Produto - Categoria Madeira (Multiplicador 0.85)

\`\`\`bash
curl -X POST "http://localhost:8080/srm-currency/api/currencies/OR/convert-to/TB?amount=75&productId=3&quantity=1"
\`\`\`

**Resultado:** 159.375 TB (75 × 2.5 × 0.85)

### 7. Conversão com Produto - Categoria Hidromel (Multiplicador 1.2)

\`\`\`bash
curl -X POST "http://localhost:8080/srm-currency/api/currencies/TB/convert-to/OR?amount=25&productId=5&quantity=1"
\`\`\`

**Resultado:** 12.00 OR (25 × 0.4 × 1.2)

## Funcionalidades Especiais

### Multiplicadores de Categoria

Cada categoria de produto possui um multiplicador que afeta a conversão:

- **Peles**: 1.0000 (sem alteração na conversão)
- **Madeira**: 0.8500 (desconto de 15% na conversão)
- **Hidromel**: 1.2000 (acréscimo de 20% na conversão)

### Produtos Disponíveis por Categoria

#### **Categoria Peles (IDs 1-2)**
- **ID 1**: Pele de Urso das Montanhas (50 OR)
- **ID 2**: Pele de Lobo Branco (35 OR)

#### **Categoria Madeira (IDs 3-4)**
- **ID 3**: Madeira de Carvalho Élfico (75 OR)
- **ID 4**: Madeira de Cerejeira Ancestral (60 TB)

#### **Categoria Hidromel (IDs 5-6)**
- **ID 5**: Hidromel dos Anões (25 TB)
- **ID 6**: Hidromel Real (40 OR)

### Sistema de Transações

Todas as conversões são registradas como transações, permitindo:

- Histórico detalhado
- Filtros avançados por data, moeda, reino, tipo, etc.
- Paginação e ordenação

### Tratamento de Erros

Sistema robusto de tratamento de exceções com:

- Mensagens de erro padronizadas
- Validação de entrada
- Logs detalhados
- Códigos HTTP apropriados

## Testes Recomendados

### Testes Básicos
1. **Status**: `GET /api/system/status`
2. **Categorias**: `GET /api/system/categories`
3. **Produtos**: `GET /api/system/products`
4. **Taxa**: `GET /api/exchange-rates/OR/to/TB`

### Testes por Categoria
1. **Peles (1.0)**: `POST /api/currencies/OR/convert-to/TB?amount=50&productId=1`
2. **Madeira (0.85)**: `POST /api/currencies/OR/convert-to/TB?amount=75&productId=3`
3. **Hidromel (1.2)**: `POST /api/currencies/TB/convert-to/OR?amount=25&productId=5`

### Cálculos Esperados
- **Conversão Simples**: 100 OR → 250 TB (100 × 2.5)
- **Com Peles**: 50 OR → 125 TB (50 × 2.5 × 1.0)
- **Com Madeira**: 75 OR → 159.375 TB (75 × 2.5 × 0.85)
- **Com Hidromel**: 25 TB → 12 OR (25 × 0.4 × 1.2)

## Dados de Exemplo

### Moedas
- **OR** (Ouro Real) - Reino SRM - Moeda base
- **TB** (Tibar) - Montanhas dos Anões

### Taxa Inicial
- 1 OR = 2.5 TB
- 1 TB = 0.4 OR

### Categorias e Multiplicadores
- **Peles**: 1.0 (sem alteração)
- **Madeira**: 0.85 (desconto de 15%)
- **Hidromel**: 1.2 (acréscimo de 20%)

---