SELECT COUNT(salida)
FROM vuelos
WHERE (desde = 'Berlín'
	AND hasta = 'Londres')
	AND salida::text ILIKE '2020-1%';
--
SELECT *, ROUND(precio - ((precio * COALESCE(descuento,0)) / 100),2) AS precio_final
FROM vuelos
WHERE salida::text ILIKE '2020-12%'
	AND desde IN ('Sevilla', 'Malaga')
	AND hasta IN ('Madrid', 'Barcelona');
--
SELECT *
FROM vuelos
WHERE (descuento = 0 OR descuento IS NULL)
	AND llegada::text ILIKE '2020-10%'
	AND SUBSTR((llegada::text),9,2)::integer<=15
	AND hasta = 'Nueva York';
--
SELECT *
FROM vuelos
WHERE salida::text ILIKE '2021-01%'
	AND desde = 'Amsterdam'
	AND SUBSTR((llegada::text),13,1)::integer>=9
	AND SUBSTR((llegada::text),15,2)::integer<=59
;

SELECT llegada
FROM vuelos;