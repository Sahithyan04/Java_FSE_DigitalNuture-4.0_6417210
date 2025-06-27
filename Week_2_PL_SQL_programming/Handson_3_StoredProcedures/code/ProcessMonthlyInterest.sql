CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE AccountType = 'Savings'
  ) LOOP
    UPDATE Accounts
    SET Balance = acc.Balance * 1.01,
        LastModified = SYSDATE
    WHERE AccountID = acc.AccountID;
  END LOOP;

  COMMIT;
END;
SELECT * FROM Accounts WHERE AccountType = 'Savings';
