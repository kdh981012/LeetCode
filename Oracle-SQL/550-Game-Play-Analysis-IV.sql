SELECT ROUND(SUM(DECODE(A.EVENT_DATE, TO_DATE(F.EVENT_DATE, 'YYYY-MM-DD')+1, 1, 0)) / SUM(DECODE(A.EVENT_DATE, F.EVENT_DATE, 1, 0)), 2) FRACTION
FROM ACTIVITY A, (
    SELECT PLAYER_ID, MIN(EVENT_DATE) EVENT_DATE
    FROM ACTIVITY 
    GROUP BY PLAYER_ID 
) F
WHERE 1=1
AND A.PLAYER_ID = F.PLAYER_ID;