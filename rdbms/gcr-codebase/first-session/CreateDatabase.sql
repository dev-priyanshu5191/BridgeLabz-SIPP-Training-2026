CREATE DATABASE covid_db;

USE covid_db;

CREATE TABLE covid_cases (
    country VARCHAR(50),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT
);

CREATE TABLE covid_deaths (
    country VARCHAR(50),
    report_date DATE,
    total_deaths INT,
    death_rate DECIMAL(5,2)
);

CREATE TABLE covid_vaccines (
    country VARCHAR(50),
    report_date DATE,
    total_vaccinations BIGINT,
    fully_vaccinated BIGINT
);