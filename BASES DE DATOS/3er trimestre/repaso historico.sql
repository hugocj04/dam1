CREATE TABLE categoria (
	id_categoria	bigint,
	nombre			varchar(255),
	descripcion 	text,
	CONSTRAINT pk_categoria PRIMARY KEY (id_categoria)
)

CREATE TABLE producto (
	num_producto	bigint,
	nombre			varchar(255) NOT NULL,
	descripcion 	text,
	precio 			numeric,
	fecha_alta 		date,
	descuento 		numeric,
	descatalogado 	boolean DEFAULT false,
	id_categoria	bigint,
	CONSTRAINT ck_producto_precio CHECK (precio >= 0),
	CONSTRAINT pk_producto PRIMARY KEY (num_producto)
);

ALTER TABLE producto
ADD CONSTRAINT fk_producto_categoria
FOREIGN KEY id_categoria REFERENCES categoria;
--ON DELETE SET NULL;

INSERT INTO producto (num_producto, nombre, descripcion, precio, fecha_alta, descuento)
VALUES (1, 'Desayuno completo', 'Café, tostada con jamón ibérico y zumo', 3.75, '2025-01-01'::date, null);

INSERT INTO producto (num_producto, nombre, descripcion, precio, fecha_alta, descuento)
VALUES (2, 'Cafe bombon', 'Cafe bombon', 3.75, '2025-02-23'::date, null);

SELECT *
FROM producto;

UPDATE producto
SET precio = 2.59
WHERE num_producto = 2;

DELETE FROM producto
WHERE num_producto = 1;

DROP TABLE IF EXISTS producto;

