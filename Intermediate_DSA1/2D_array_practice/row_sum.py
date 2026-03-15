# Problem Description
# You are given a 2D matrix A of integers.
# Your task is to compute the sum of elements in each row and return a 1D array where each element represents the sum of a corresponding row in the matrix.

# Problem Constraints
# 1 <= A.size() <= 103
# 1 <= A[i].size() <= 103
# 1 <= A[i][j] <= 103

# Input Format
# First argument A is a 2D array of integers.(2D matrix).

# Output Format
# Return an array containing row-wise sums of original matrix.

# Example Input
# Input 1:
# [1,2,3,4]
# [5,6,7,8]
# [9,2,3,4]

# Example Output
# Output 1:
# [10,26,18]

# Example Explanation
# Explanation 1
# Row 1 = 1+2+3+4 = 10
# Row 2 = 5+6+7+8 = 26
# Row 3 = 9+2+3+4 = 18

def rowSum(A):
    n = len(A)
    m = len(A[0])
    resultList = []
    for i in range(n):
        sumRow = 0
        for j in range(m):
            sumRow += A[i][j]
        resultList.append(sumRow)
    return resultList

A = [[1,2,3,4], [5,6,7,8], [9,2,3,4]]
result = rowSum(A)
print(result)