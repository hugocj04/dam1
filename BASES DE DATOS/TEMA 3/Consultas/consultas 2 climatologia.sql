SELECT 1.0/2;

SELECT 1::real/2;

SELECT fecha, fecha::text
FROM climatologia
LIMIT 10;

SELECT *
FROM climatologia
-- :: --> Convierte a texto
WHERE fecha::text LIKE '%-04-%'
  AND provincia = 'Sevilla';

  