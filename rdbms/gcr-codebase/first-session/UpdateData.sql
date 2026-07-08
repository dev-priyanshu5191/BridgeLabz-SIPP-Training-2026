USE covid_db;

UPDATE covid_cases
SET confirmed_cases = 44700000
WHERE country = 'India'
AND report_date = '2023-01-02';