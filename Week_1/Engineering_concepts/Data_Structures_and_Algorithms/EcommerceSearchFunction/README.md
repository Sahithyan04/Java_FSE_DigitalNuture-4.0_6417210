# Ecommerce Search Function

This project demonstrates the implementation of linear and binary search on an array of products.

## Description

A `Product` class is created with the following attributes:
- `productId`
- `productName`
- `productCategory`

Two search algorithms are implemented:
- **Linear Search**: checks each product one by one
- **Binary Search**: works on a sorted array using product name

## Features

- Custom object search
- Case-insensitive comparison
- Sorted data with Comparator for binary search

## Files

- `Product.java` — defines the product structure
- `SearchTest.java` — runs both linear and binary search

## Example Output

```
✅ Found: [106] Watch (Accessories)
```

## Time Complexity

| Algorithm     | Best Case | Worst Case | Sorted Required |
|---------------|-----------|------------|------------------|
| Linear Search | O(1)      | O(n)       | ❌ No            |
| Binary Search | O(1)      | O(log n)   | ✅ Yes           |
