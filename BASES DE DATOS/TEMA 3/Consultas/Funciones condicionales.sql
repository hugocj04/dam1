SELECT estacion, temperatura_maxima,
	CASE
		WHEN temperatura_maxima > 38 then 'Mucho calor'
		WHEN temperatura_maxima BETWEEN 30 AND 38 then 'Calor'
		ELSE 'No mucho calor'
	END AS "msg_temp"
FROM climatologia
WHERE provincia = 'Sevilla'
ORDER BY temperatura_maxima DESC;

SELECT fecha, estacion, provincia,
	   precipitacion_total,
	CASE precipitacion_total
		WHEN 0 THEN 'No ha llovido'
		WHEN NULL THEN 'No ha llovido'
		ELSE 'Ha llovido'
	END
FROM climatologia;