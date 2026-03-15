# Problem Description
# Given an array A of length N, your task is to find the maximum possible sum of any non-empty contiguous subarray.
# In other words, among all possible subarrays of A, determine the one that yields the highest sum and return that sum.

# Problem Constraints
# 1 <= N <= 106
# -1000 <= A[i] <= 1000

# Input Format
# The first and the only argument contains an integer array, A.

# Output Format
# Return an integer representing the maximum possible sum of the contiguous subarray.

# Example Input
# Input 1:
#  A = [1, 2, 3, 4, -10] 

# Input 2:
#  A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 

# Example Output
# Output 1:
#  10 

# Output 2:
#  6 

# Example Explanation
# Explanation 1:
#  The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 

# Explanation 2:
#  The subarray [4,-1,2,1] has the maximum possible sum of 6.

def maxSumOfSubArray(A):
    current_sum = 0
    max_sum = 0
    for i in range(len(A)):
        current_sum = current_sum + A[i]
        max_sum = max(max_sum, current_sum)
        if current_sum < 0:
            current_sum = 0

    return max_sum

A = [1, 2, 3, 4, -10]
result = maxSumOfSubArray(A)
print('result:', result)