# Problem Description
# You are given an integer array A of length N.
# You have to find the sum of all subarray sums of A.
# More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
# A subarray sum denotes the sum of all the elements of that subarray.
# Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

# Problem Constraints
# 1 <= N <= 105
# 1 <= Ai <= 10 4

# Input Format
# The first argument is the integer array A.

# Output Format
# Return a single integer denoting the sum of all subarray sums of the given array.

# Example Input
# Input 1:
# A = [1, 2, 3]
# Input 2:
# A = [2, 1, 3]

# Example Output
# Output 1:
# 20
# Output 2:
# 19

# Example Explanation
# Explanation 1:
# The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
# Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20

# Explanation 2:
# The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
# Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19

def sumOfAllSubArrays(A):
    answer = 0
    for i in range(len(A)):
        totalSum = 0
        for j in range(i, len(A)):
            totalSum += A[j]
            answer += totalSum

    return answer

A = [1, 2, 3]
result = sumOfAllSubArrays(A)
print(result)

#Contribution technique
def sumOfAllSubArraysUsingContribution(A):
    answer = 0
    n = len(A)
    for i in range(n):
        answer += A[i] * (i + 1) * (n - i)

    return answer

result = sumOfAllSubArraysUsingContribution(A)
print(result)