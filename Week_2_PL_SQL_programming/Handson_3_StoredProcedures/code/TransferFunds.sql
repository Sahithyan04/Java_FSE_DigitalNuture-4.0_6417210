CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Get source account balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account;

  -- Check if sufficient balance
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account!');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET Balance = Balance - p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_from_account;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_to_account;

  COMMIT;
END;

EXEC TransferFunds(1, 2, 500);
