CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    factory VARCHAR(255),
    price INTEGER,
    count INTEGER
);

SELECT * FROM products WHERE factory = 'Молокозавод 3';
