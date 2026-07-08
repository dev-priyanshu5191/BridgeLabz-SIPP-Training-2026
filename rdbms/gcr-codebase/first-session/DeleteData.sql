USE covid_db;

DELETE FROM covid_cases
WHERE country = 'IN';

DELETE FROM covid_cases
WHERE country = 'India'
AND report_date = '2023-01-02'
LIMIT 1;