-- SELECT *, precio * 1 + precio * 0.21 AS "con iva"
-- SELECT *, precio * (1 + 0.21) AS "con iva"
SELECT *, precio * 1.21 AS "con iva"
FROM vuelos;

SELECT precio, descuento,
       precio * 1 - precio * (descuento/100),
	   precio * (1 - (descuento / 100))
FROM vuelos;

SELECT avg (precio)
FROM vuelos;

SELECT *
FROM vuelos
ORDER BY random();