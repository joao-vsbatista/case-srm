-- Versão adaptada para MySQL
CREATE TABLE kingdoms (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL UNIQUE,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Resto das tabelas igual...

-- Para ENUM no MySQL:
CREATE TABLE transactions (
    -- ... outros campos ...
    transaction_type ENUM('EXCHANGE', 'PURCHASE', 'SALE') NOT NULL,
    status ENUM('PENDING', 'COMPLETED', 'FAILED', 'CANCELLED') DEFAULT 'PENDING',
    -- ... resto igual ...
);
