SELECT s.ID, s.NAME, e.EMAIL
FROM STUDENT s LEFT JOIN EMAIL e ON s.ID = e.ID
ORDER BY s.id ASC;