DROP TABLE PRODUCTS;
CREATE TABLE PRODUCTS (ID INT NOT NULL, PRODUCT VARCHAR(50) NOT NULL,COMPANY VARCHAR(20) NOT NULL);
INSERT INTO PRODUCTS (PRODUCT, COMPANY) VALUES
  ('camera', 'digital camera 42x optical zoom'),
  ('phone', 'Huawei P30 Lite 128GB with 4GB RAM'),
  ('laptop', 'Apple MacBook Pro 13-inch, 256GB with 8GB RAM');