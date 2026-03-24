# Problem Description
# Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

# Problem Constraints
# 1 <= A <= 1000

# Input Format
# First and only argument is integer A

# Output Format
# Return a 2-D matrix which consists of the elements added in spiral order.

# Example Input
# Input 1:
# 1

# Input 2:
# 2

# Input 3:
# 5

# Example Output
# Output 1:
# [ [1] ]

# Output 2:
# [ [1, 2], 
#   [4, 3] ]

# Output 3:
# [ [1,   2,  3,  4, 5], 
#   [16, 17, 18, 19, 6], 
#   [15, 24, 25, 20, 7], 
#   [14, 23, 22, 21, 8], 
#   [13, 12, 11, 10, 9] ]

def createSpiralMatrix(A):
    if A == 1:
        return [[A]]
    
    n = A
    resultMatrix = [[0 for _ in range(n)] for _ in range(n)]

    i = j = 0
    elementNumber = 0
    
    while (n > 1):
        for _ in range(n-1):
            elementNumber = elementNumber + 1
            resultMatrix[i][j] = elementNumber
            j += 1

        for _ in range(n-1):
            elementNumber = elementNumber + 1
            resultMatrix[i][j] = elementNumber
            i += 1

        for _ in range(n-1):
            elementNumber = elementNumber + 1
            resultMatrix[i][j] = elementNumber
            j -= 1

        for _ in range(n-1):
            elementNumber = elementNumber + 1
            resultMatrix[i][j] = elementNumber
            i -= 1

        i += 1
        j += 1
        n -= 2
    
    if n == 1:
        resultMatrix[i][j] = A * A

    return resultMatrix

A = 5
result = createSpiralMatrix(A)
print(result, 'result')