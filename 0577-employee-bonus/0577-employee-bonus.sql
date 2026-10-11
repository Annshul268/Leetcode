# Write your MySQL query statement below
SELECT T1.name, T2.bonus
FROM Employee T1
LEFT JOIN Bonus T2
ON T1.empId = T2.empId
WHERE bonus IS NULL OR bonus < 1000;