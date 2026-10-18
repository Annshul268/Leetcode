# Write your MySQL query statement below

-- SELECT(
--     SELECT DISTINCT(SALARY)
--     FROM Employee
--     ORDER BY SALARY DESC
--     LIMIT 1
--     OFFSET 1
-- ) AS 'SecondHighestSalary';


-- WINDOW FUNCTION

SELECT (
    SELECT 
    NTH_VALUE(SALARY,2) OVER(
        ORDER BY SALARY DESC
        ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING
    )
    FROM(
        SELECT DISTINCT SALARY
        FROM EMPLOYEE
    ) AS SALARIES
    LIMIT 1
) AS SecondHighestSalary