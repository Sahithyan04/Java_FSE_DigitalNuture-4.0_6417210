#  Bank Procedures - PL/SQL

This repo contains 3 stored procedures to simulate basic banking operations.

##  Procedures

### 1. ProcessMonthlyInterest
Applies 1% monthly interest to all `Savings` accounts by updating their balances.

### 2. UpdateEmployeeBonus
Increases salary of employees in a given department based on a bonus percentage passed as input.

### 3. TransferFunds
Transfers funds between two accounts after verifying the source has sufficient balance.

##  Usage

- `EXEC ProcessMonthlyInterest;`
- `EXEC UpdateEmployeeBonus('Sales', 10);`
- `EXEC TransferFunds(1, 2, 500);`

##  Notes

- Ensure `Accounts` and `Employees` tables exist with correct structure.
- Use `SET SERVEROUTPUT ON;` to view outputs.
- For restricted Oracle users, use anonymous blocks instead of stored procedures.
