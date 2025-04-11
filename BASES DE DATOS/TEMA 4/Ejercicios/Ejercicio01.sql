SELECT first_name, last_name, email
FROM employees
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
WHERE country_name = 'United Kingdom';