-- Ejercicio 1
SELECT ROUND(AVG(precipitacion_total),2) AS precipitacion_total_media
FROM climatologia
WHERE provincia IN ('Huesca', 'Zaragoza', 'Teruel')
	AND fecha::text ILIKE '2019-06%';

-- Ejercicio 2
SELECT *, (precipitacion_0_a_6 + precipitacion_6_a_12 + precipitacion_12_a_18 + precipitacion_18_a_24) AS suma_precipitaciones
FROM climatologia
WHERE (estacion ILIKE '%f%'
	OR estacion ILIKE '%t%'
	OR estacion ILIKE '%x%')
	AND fecha::text ILIKE '2019-02%';

-- Ejercicio 3
SELECT estacion
FROM climatologia
WHERE LEFT ((estacion),2) = 'Ba'
	AND temperatura_maxima BETWEEN 25 AND 30
	AND temperatura_minima < 15
	AND (fecha::text ILIKE '2019-09%'
	OR fecha::text ILIKE '2019-10%');

-- Ejercicio 4
SELECT estacion, provincia, fecha, racha_viento,
	CASE
		WHEN racha_viento > 25 AND racha_viento <= 40 THEN 'Ventoso'
		WHEN racha_viento > 40 AND racha_viento <= 60 THEN 'Muy ventoso'
		WHEN racha_viento > 60 THEN 'Huracanado'
		ELSE 'Poco viento'
	END AS "txt_racha_viento"
FROM climatologia
WHERE racha_viento > 25
	AND hora_racha_viento = '15:00'
	AND (fecha::text ILIKE '%03%'
	OR fecha::text ILIKE '%04%')
	AND temperatura_maxima > 23
ORDER BY racha_viento DESC;

-- Ejercicio 5
SELECT provincia, estacion, fecha, velocidad_maxima_viento, racha_viento,
	(((temperatura_minima / temperatura_maxima) * 100)) AS porcentaje_diferencia_entre_temp_max_y_min
FROM climatologia
WHERE temperatura_minima > 10
	AND ((((temperatura_maxima - temperatura_minima) * 20) / 100) > ((temperatura_maxima * 20) / 100)
	OR (((temperatura_maxima - temperatura_minima) * 20) / 100) < ((temperatura_maxima * 30) / 100)
	OR (((temperatura_maxima - temperatura_minima) * 30) / 100) < ((temperatura_maxima * 20) / 100)
	OR (((temperatura_maxima - temperatura_minima) * 30) / 100) < ((temperatura_maxima * 30) / 100))
ORDER BY provincia DESC, estacion DESC, fecha ASC;