CREATE DATABASE product_details;
CREATE TABLE product(
    id INT,
    name VARCHAR(20) NOT NULL ,
    price DOUBLE,
    quantity INT,
    PRIMARY KEY (id)
);