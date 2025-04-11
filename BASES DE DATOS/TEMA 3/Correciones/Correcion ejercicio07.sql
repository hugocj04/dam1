SELECT hasta
FROM vuelos
	WHERE hasta = 'Nueva York';

SELECT *
FROM vuelos
WHERE (desde = 'Berlín' AND hasta = 'Londres')
	AND llegada::text ILIKE '2020-1%';

SELECT *
FROM vuelos
WHERE (descuento IS NULL OR descuento = 0)
	AND llegada::text ILIKE '%-10-%'
	AND RIGHT(LEFT(llegada::text, 10), 2)::integer <= 15
	AND hasta = 'Nueva York';

SELECT *, ROUND((precio - (precio * (COALESCE(descuento,0) / 100))),2) AS precio_final
FROM vuelos
WHERE salida::text ILIKE '%-12-%'
	AND (desde IN ('Sevilla', 'Malaga')
	AND hasta IN ('Madrid', 'Barcelona'));