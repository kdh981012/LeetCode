SELECT USER_ID--, SUM(ACTION) CONFIRMED, COUNT(ACTION) TOTAL
 ,ROUND(SUM(ACTION) / COUNT(ACTION), 2) CONFIRMATION_RATE
FROM (
    SELECT S.USER_ID
    , NVL(DECODE(ACTION, 'timout', 0, 'confirmed',1, null, 0), 0) action
    FROM SIGNUPS S, CONFIRMATIONS C
    WHERE 1=1
    AND S.USER_ID = C.USER_ID (+)
)
GROUP BY USER_ID; 
