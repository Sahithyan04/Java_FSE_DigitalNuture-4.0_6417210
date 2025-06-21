# TheForecaster

A simple financial forecaster function that calculates future value based on past data using recursion.

## 📌 Features
- Predicts future value using compound growth formula
- Recursive implementation
- Customizable growth rate, initial value, and duration

## 📈 Formula
```
FutureValue(n) = FutureValue(n - 1) * (1 + growthRate)
Base case: FutureValue(0) = PresentValue
```

## 🧠 Time Complexity
- Recursive depth: O(n) where n = number of years
- Optimizable using iteration (if needed)

## 🛠 Files
- `TheForecaster.java`: contains the recursive logic
- `TheForecasterApp.java`: runs and tests the forecasting logic

## 🧪 Sample Output
```
📈 Future value after 3 years: ₹1331.0
```
