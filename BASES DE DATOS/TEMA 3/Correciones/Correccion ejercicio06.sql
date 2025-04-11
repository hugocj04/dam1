SELECT AVG(temperatura_media)
FROM climatologia
WHERE LEFT(fecha::text,7) = '2019-05'
  AND provincia IN ('Sevilla', 'Jaén', 'Malaga', 'Cadiz', 'Córdoba', 'Almería', 'Granada')
  AND STARTS_WITH(LOWER(estacion),'al');
--
SELECT fecha, estacion, temperatura_media,
  CASE 
    WHEN precipitacion_total >= 50 THEN 'CHUZOS DE PUNTA'
    WHEN precipitacion_total >= 40 AND precipitacion_total < 50 THEN 'A CÁNTAROS'
    WHEN precipitacion_total >= 25 AND precipitacion_total < 40 THEN 'MUCHA LLUVIA'
    WHEN precipitacion_total >= 10 AND precipitacion_total < 25 THEN 'FALTA LE HACÍA AL CAMPO'
    WHEN precipitacion_total > 0 OR null THEN 'HA LLOVIDO POCO'
    ELSE 'NO HA LLOVIDO'
	END AS precipitacion_total_texto
FROM climatologia
WHERE provincia = 'Jaén'
	AND fecha::text LIKE '2019-11%'
ORDER BY fecha, estacion;
--
SELECT fecha,
	UPPER(estacion),
	UPPER(provincia), temperatura_maxima,
	UPPER(hora_temperatura_maxima) AS hora_temperatura_maxima, temperatura_minima,
	UPPER(hora_temperatura_minima) AS hora_temperatura_minima, racha_viento,
	UPPER(hora_racha_viento) AS hora_racha_viento, velocidad_maxima_viento,
	UPPER(hora_velocidad_maxima_viento) AS hora_velocidad_maxima_viento
FROM climatologia
WHERE hora_temperatura_maxima = '14:00'
	AND fecha::text ILIKE '2019-03%'
	AND provincia IN ('Asturias', 'Cantabria');
