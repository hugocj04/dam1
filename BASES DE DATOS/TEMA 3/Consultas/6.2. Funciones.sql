SELECT concat(last_name, ', ', first_name)
FROM employees;

SELECT concat_ws(', ', last_name, first_name)
FROM employees;

SELECT *
FROM employees
WHERE length(last_name) = 5;

SELECT initcap('En un lugar de LA MANCHA'),
 lower('En un lugar de LA MANCHA'),
 upper('En un lugar de LA MANCHA');

 SELECT *
 FROM locations
 WHERE lower(city) in ('toronto', 'oxford');

SELECT right('En un lugar de LA MANCHA', 5);

SELECT replace('En un lugar de LA MANCHA', 'LA MANCHA', 'Mi pueblo');

SELECT length('-~-~-~ hola mundo -~-~-~'),
         trim('-~-~-~ hola mundo -~-~-~', '-~'),
  length(trim('-~-~-~ hola mundo -~-~-~', '-~'));

SELECT *
FROM climatologia
WHERE starts_with(lower(estacion), 'b');