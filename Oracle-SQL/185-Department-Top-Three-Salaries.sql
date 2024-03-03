SELECT DEPARTMENT, EMPLOYEE, SALARY
FROM (
    SELECT D.NAME DEPARTMENT, E.NAME EMPLOYEE, E.SALARY SALARY
    , DENSE_RANK() OVER (PARTITION BY D.NAME ORDER BY E.SALARY DESC) AS TOP3
    FROM EMPLOYEE E INNER JOIN DEPARTMENT D
    ON E.DEPARTMENTID = D.ID
)
WHERE 1=1
AND TOP3 <= 3;