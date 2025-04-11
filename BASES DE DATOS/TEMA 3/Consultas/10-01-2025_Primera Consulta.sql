SELECT *
FROM climatologia
WHERE estacion ILIKE 'villa%';

-- Seleccionar los datos de climatoloigia
-- de aquellas estaciones cuyo nombre
-- tenga 5 letras

SELECT *
FROM climatologia
WHERE estacion ILIKE '_____'
ORDER BY estacion ASC;

-- Seleccionar los registros de climatologia
-- para quellas temperaturas medias entre
-- 15º y 25º

SELECT *
FROM climatologia
WHERE temperatura_media BETWEEN 15 AND 25
ORDER BY temperatura_media DESC;

-- Registros
-- Temp_media < 10
-- Provincia = Sevilla

SELECT *
FROM climatologia
WHERE temperatura_media < 10
  AND provincia = 'Sevilla'
  AND hora_temperatura_maxima ILIKE '14%';

SELECT *
FROM climatologia 
WHERE precipitacion_total > 0
  AND (provincia = 'Sevilla'
   OR provincia = 'Jaén');

SELECT *
FROM climatologia
WHERE racha_viento IS NOT NULL;

SELECT 'Hola' || 'Mundo';

SELECT fecha,
       estacion || ', ' || provincia AS "Lugar",
	   temperatura_maxima
FROM climatologia
WHERE temperatura_maxima > 43;

SELECT temperatura_media,
       (temperatura_maxima + temperatura_minima) / 2
	   AS "promedio_calculado"
FROM climatologia;

SELECT *
FROM climatologia
WHERE precipitacion_0_a_6 >= precipitacion_total / 2;

