-- Insertar datos en la tabla fabricante
INSERT INTO fabricante (id, nombre) VALUES (1, 'Toyota');
INSERT INTO fabricante (id, nombre) VALUES (2, 'Ford');
INSERT INTO fabricante (id, nombre) VALUES (3, 'Volkswagen');
INSERT INTO fabricante (id, nombre) VALUES (4, 'BMW');
INSERT INTO fabricante (id, nombre) VALUES (5, 'Honda');

-- Insertar datos en la tabla producto
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (1, 'Corolla', 20000.00, 1);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (2, 'Focus', 18000.00, 2);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (3, 'Golf', 22000.00, 3);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (4, 'Serie 3', 35000.00, 4);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (5, 'Civic', 21000.00, 5);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (6, 'Camry', 24000.00, 1);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (7, 'Mustang', 26000.00, 2);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (8, 'Polo', 19000.00, 3);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (9, 'X5', 65000.00, 4);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (10, 'Accord', 23000.00, 5);

INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (11, 'RAV4', 27000.00, 1);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (12, 'F-150', 30000.00, 2);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (13, 'Tiguan', 32000.00, 3);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (14, 'M3', 70000.00, 4);
INSERT INTO producto (id, nombre, precio, id_fabricante) VALUES (15, 'Fit', 19000.00, 5);