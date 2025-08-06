-- Script de dados iniciais para o Sistema SRM

-- Inserir Reinos
INSERT INTO kingdoms (name, description) VALUES 
('SRM', 'Reino antigo onde magia e comércio caminham lado a lado'),
('Montanhas dos Anões', 'Reino montanhoso habitado pelos anões comerciantes'),
('Terras Distantes', 'Reinos visitantes do mercado');

-- Inserir Moedas
INSERT INTO currencies (code, name, symbol, kingdom_id, is_base_currency) VALUES 
('OR', 'Ouro Real', '⚜', 1, TRUE),
('TB', 'Tibar', '⛏', 2, FALSE);

-- Inserir Categorias de Produtos (apenas 3)
INSERT INTO product_categories (name, description, conversion_multiplier) VALUES 
('Peles', 'Peles de animais raros e comuns', 1.0000),
('Madeira', 'Madeiras nobres e comuns', 0.8500),
('Hidromel', 'Bebidas fermentadas e destilados', 1.2000);

-- Inserir Produtos
INSERT INTO products (name, description, category_id, base_price, base_currency_id, kingdom_id) VALUES 
('Pele de Urso das Montanhas', 'Pele resistente de urso das montanhas geladas', 1, 50.0000, 1, 2),
('Pele de Lobo Branco', 'Pele macia de lobo das planícies nevadas', 1, 35.0000, 1, 1),
('Madeira de Carvalho Élfico', 'Madeira mágica com propriedades especiais', 2, 75.0000, 1, 1),
('Madeira de Cerejeira Ancestral', 'Madeira avermelhada de árvores centenárias', 2, 60.0000, 2, 2),
('Hidromel dos Anões', 'Bebida tradicional dos anões das montanhas', 3, 25.0000, 2, 2),
('Hidromel Real', 'Hidromel especial servido na corte do Reino SRM', 3, 40.0000, 1, 1);

-- Inserir Taxa de Câmbio Inicial (1 Ouro Real = 2.5 Tibares)
INSERT INTO exchange_rates (from_currency_id, to_currency_id, rate, effective_date) VALUES 
(1, 2, 2.5000, CURDATE()),
(2, 1, 0.4000, CURDATE());
