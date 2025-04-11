SELECT *
FROM departments JOIN employees USING(department_id)
WHERE hire_date::text ILIKE '1993%';
--
SELECT regions.*
FROM employees
	JOIN departments USING(department_id)
	JOIN locations USING(location_id)
	JOIN countries USING(country_id)
	JOIN regions USING(region_id)
WHERE salary < 10000;
--
SELECT *
FROM employees emple
	JOIN employees jefe ON (emple.manager_id = jefe.employee_id)
WHERE UPPER(LEFT(jefe.last_name,1)) IN ('D', 'H', 'S');
--
SELECT COUNT(*)
-- SELECT *
FROM dependents JOIN employees
        USING (employee_id)
        JOIN departments USING (department_id)
WHERE department_name
        IN ('Marketing','Administration', 'IT')
  AND relationship = 'Child';