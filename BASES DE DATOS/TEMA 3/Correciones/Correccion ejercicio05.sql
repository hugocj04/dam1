SELECT ROUND(AVG(precipitacion_total),2)
FROM climatologia
WHERE provincia = 'Sevilla'
  AND fecha::text LIKE '2019-04%';
/*  AND fecha BETWEEN '2019-04-01'::date
                   AND '2019-04-30'::date*/
--
SELECT SUBSTR(fecha::text,7,1)
FROM climatologia;

SELECT *
--SELECT DISTINCT fecha
FROM climatologia
WHERE estacion ILIKE '%E%'
  /*AND fecha::text
          IN ('2019-02-28', '2019-03-31', '2019-04-30')*/
  AND fecha::text ILIKE '2019%'      
  AND SUBSTR(fecha::text,7,1) IN ('2', '3', '4')
  AND RIGHT(fecha::text, 2)::integer >= 25
ORDER BY provincia, estacion, fecha DESC;
--
SELECT SUM(precipitacion_total)
FROM climatologia
WHERE fecha::text ILIKE '2019-09%'
  --AND provincia IN ('Lugo', 'A Coruña', 'Pontevedra', 'Ourense');
  AND (provincia = 'Lugo'
   OR provincia = 'A Coruña'
   OR provincia = 'Pontevedra'
   OR provincia = 'Ourense');
--
--SELECT *,
SELECT fecha, estacion, provincia,
    precipitacion_total,
    CASE
        WHEN precipitacion_total = 0 THEN 0
        --WHEN precipitacion_total IS NULL THEN 'Sin datos'
        ELSE precipitacion_0_a_6 / precipitacion_total
    END AS "% 0 A 6",
    CASE
        WHEN precipitacion_total = 0 THEN 0
        ELSE ROUND((precipitacion_6_a_12 / precipitacion_total)*100,2)
    END AS "% 6 a 12",
    CASE
        WHEN precipitacion_total = 0 THEN 0
        ELSE precipitacion_12_a_18 / precipitacion_total
    END AS "% 12 a 18",
        CASE
        WHEN precipitacion_total = 0 THEN 0
        ELSE precipitacion_18_a_24 / precipitacion_total
    END AS "% 18 a 24"
FROM climatologia
WHERE provincia IN ('Toledo', 'Guadalajara',
                   'Cuenca', 'Albacete',
                   'Ciudad Real')
  AND ((fecha::text LIKE '2019-03%'
          AND RIGHT(fecha::text,2)::integer >= 21)
   --OR (fecha::text LIKE '2019-04%')          
   --OR (fecha::text LIKE '2019-05%')
   OR SUBSTR(fecha::text,7,1) IN ('4','5')
   OR (fecha::text LIKE '2019-06%'
          AND RIGHT(fecha::text,2)::integer < 21))
ORDER BY fecha ASC;
--
SELECT precipitacion_0_a_6 / precipitacion_total,
        *
FROM climatologia
WHERE precipitacion_total > 50
  AND (precipitacion_0_a_6 / precipitacion_total)*100
          BETWEEN 60 AND 80
ORDER BY precipitacion_total DESC, fecha
