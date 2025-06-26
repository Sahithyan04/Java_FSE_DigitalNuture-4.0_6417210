SET SERVEROUTPUT ON;

BEGIN
  FOR loan_rec IN (
    SELECT LoanID, CustomerID, EndDate
    FROM Loans
    WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      '📣 Reminder: Loan ID ' || loan_rec.LoanID || 
      ' for Customer ID ' || loan_rec.CustomerID || 
      ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
