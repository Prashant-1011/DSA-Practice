# Problem Description
# Given an integer array A of size N, find the first repeating element in it.
# We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
# If there is no repeating element, return -1.

# Problem Constraints
# 1 <= N <= 105
# 1 <= A[i] <= 109

# Input Format
# The first and only argument is an integer array A of size N.

# Output Format
# Return an integer denoting the first repeating element.

# Example Input
# Input 1:
#  A = [10, 5, 3, 4, 3, 5, 6]

# Input 2:
#  A = [6, 10, 5, 4, 9, 120]

# Example Output
# Output 1:
#  5

# Output 2:
#  -1

# Example Explanation
# Explanation 1:
#  5 is the first element that repeats

# Explanation 2:
#  There is no repeating element, output -1

def findFirstRepeatingElement(A):
    myDict = dict()
    n = len(A)
    for i in range(n):
        if A[i] not in myDict:
            myDict[A[i]] = 1
        else:
            myDict[A[i]] += 1

    for key in myDict:
        if myDict[key] > 1:
            return key
    
    return -1

A = [10, 5, 3, 4, 3, 5, 6]
A = [6, 10, 5, 4, 9, 120]
result = findFirstRepeatingElement(A)
print('result:', result)