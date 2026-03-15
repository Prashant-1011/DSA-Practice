# Problem Description
# Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

# Problem Constraints
# 1<= N <= 1000
# 1<= A[i][j] <= 1e9

# Input Format
# Only argument is a 2D array A of size N * N.

# Output Format
# Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
# The vacant spaces in the grid should be assigned to 0.

# Example Input
# Input 1:
# 1 2 3
# 4 5 6
# 7 8 9

# Input 2:
# 1 2
# 3 4

# Example Output
# Output 1:
# 1 0 0
# 2 4 0
# 3 5 7
# 6 8 0
# 9 0 0

# Output 2:
# 1 0
# 2 3
# 4 0
def antiDiagonal(A):
    n = len(A)
    resultList = []
    for j in range(n):
        countOfElements = 0
        i = 0
        rowItems = []
        while i < n and j >= 0:
            countOfElements += 1
            rowItems.append(A[i][j])
            i += 1
            j -= 1

        #Appending remainig elements as 0
        rowItems.extend([0] * (n - countOfElements))
        resultList.append(rowItems)

    for i in range(1, n, 1):
        countOfElements = 0
        j = n-1
        rowItems = []
        while i < n and j >= 0:
            countOfElements += 1
            rowItems.append(A[i][j])
            i += 1
            j -= 1

        rowItems.extend([0] * (n - countOfElements))
        resultList.append(rowItems)
    
    return resultList

A = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
result = antiDiagonal(A)
print(result, "result")
