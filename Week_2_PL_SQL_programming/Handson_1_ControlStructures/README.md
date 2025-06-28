# Exercise 1: Control Structures in PL/SQL

## Objective
Apply conditional logic and looping to simulate real-world banking operations like discounts, promotions, and reminders using PL/SQL blocks.

---

##  Scenarios & Tasks

###  Scenario 1: Senior Discount on Loan Interest
** Task:**  
Loop through all customers and check if their age is above 60.  
If yes, apply a **1% discount** to their current loan interest rate.

**🛠 Logic Highlights:**
- Use `FOR` loop and `IF` condition
- Use `UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID = X`

---

###  Scenario 2: Promote to VIP
** Task:**  
Loop through customers and promote those with **Balance > $10,000** by setting an `IsVIP` flag to `TRUE`.

** Logic Highlights:**
- Add `IsVIP` column to `Customers` table: `ALTER TABLE Customers ADD IsVIP VARCHAR2(5)`
- Use `FOR` loop + `IF` block + `UPDATE`

---

###  Scenario 3: Loan Due Reminder
** Task:**  
Fetch all loans that are **due in the next 30 days** and display reminder messages using `DBMS_OUTPUT.PUT_LINE`.

** Logic Highlights:**
- Use `SYSDATE` with `BETWEEN`
- Print formatted string with loan/customer details

---

##  What's Learned

- Writing structured `PL/SQL` blocks
- Looping through result sets using `FOR`
- Applying real-life logic with `IF`, `UPDATE`, and `DBMS_OUTPUT`

---

##  Example File Names

```
control_structures/
├── senior_discount.sql
├── promote_vip.sql
└── loan_reminder.sql
