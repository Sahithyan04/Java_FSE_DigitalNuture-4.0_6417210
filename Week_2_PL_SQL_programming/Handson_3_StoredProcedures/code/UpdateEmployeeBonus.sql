DECLARE
  v_dept VARCHAR2(50) := 'Sales';
  v_bonus NUMBER := 10;
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * v_bonus / 100)
  WHERE Department = v_dept;

  COMMIT;
END;
SELECT * FROM Employees;
