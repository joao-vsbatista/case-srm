-- Versão adaptada para PostgreSQL
CREATE TABLE kingdoms (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Para ENUM no PostgreSQL:
CREATE TYPE transaction_type_enum AS ENUM ('EXCHANGE', 'PURCHASE', 'SALE');
CREATE TYPE transaction_status_enum AS ENUM ('PENDING', 'COMPLETED', 'FAILED', 'CANCELLED');

CREATE TABLE transactions (
    id BIGSERIAL PRIMARY KEY,
    transaction_type transaction_type_enum NOT NULL,
    status transaction_status_enum DEFAULT 'PENDING',
    -- ... resto dos campos ...
);
