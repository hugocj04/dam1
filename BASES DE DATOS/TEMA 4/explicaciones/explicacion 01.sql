SELECT first_name, last_name, department_name
FROM employees e, departments d
WHERE e.department_id =
		d.department_id;

SELECT first_name, last_name, salary
FROM employees e
	JOIN departments USING(department_id)
WHERE e.salary > 10000;

SELECT *
FROM employees e
	JOIN departments d
		ON(e.department_id = d.department_id);