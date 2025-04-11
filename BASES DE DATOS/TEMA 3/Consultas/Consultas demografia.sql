SELECT *
FROM demografia_basica;

SELECT *, 
	   (hombres + mujeres) AS "total",
	   ROUND ((mujeres::numeric
	   / (hombres + mujeres)) * 100,2) AS "%_m"
FROM demografia_basica
ORDER BY total DESC;