from typing import List

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        row = [1]  # Start with the first element always 1
        for i in range(1, rowIndex + 1):
            # Use math: each element is prev * (rowIndex - i + 1) // i
            row.append(row[-1] * (rowIndex - i + 1) // i)
        return row
"""
This function builds a single row of Pascal's Triangle using math shortcuts.

Pascal's Triangle is a triangle of numbers where:
- The first and last number in each row is always 1
- Every number in between is the sum of the two numbers above it

But instead of building the whole triangle, we're calculating just one row
—like Row 4: [1, 4, 6, 4, 1].

We use a math trick to build the row without using factorials.

Each number is built from the one before it using:
    next = previous x (rowIndex - i + 1) ÷ i

This is a shortcut from the combination formula:
    C(n, k) = C(n, k-1) x (n - k + 1) ÷ k

Thay's why we start with [1] and keep adding new numbers one by one,
each time multiplying the last number by a shrinking numerator
and dividing by the growing denominator.

Example (rowIndex = 4):
Step 0: [1]
Step 1: 1 x (4 / 1) = 4 → [1, 4]
Step 2: 4 x (3 / 2) = 6 → [1, 4, 6]
Step 3: 6 x (2 / 3) = 4 → [1, 4, 6, 4]
Step 4: 4 x (1 / 4) = 1 → [1, 4, 6, 4, 1]

Efficient, no recursion, and no factorials.
"""
