# Write your MySQL query statement below
SELECT
    name,
    bonus
FROM
    Employee e
LEFT JOIN
    Bonus b
ON 
    b.empId = e.empId
WHERE 
    Bonus < 1000 
OR
    Bonus IS NULL