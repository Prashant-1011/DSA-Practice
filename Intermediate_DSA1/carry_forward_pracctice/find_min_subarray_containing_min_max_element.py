# Problem Description
# Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
# and at least one occurrence of the minimum value of the array.

# Problem Constraints
# 1 <= |A| <= 2000

# Input Format
# First and only argument is vector A

# Output Format
# Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array

# Example Input
# Input 1:
# A = [1, 3, 2]
# Input 2:
# A = [2, 6, 1, 6, 9]

# Example Output
# Output 1:
#  2
# Output 2:
#  3

# Example Explanation
# Explanation 1:
#  Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
# Explanation 2:
#  Take the last 3 elements of the array.

import sys
def finMinMaxInSubArray(A):
    minValue = sys.maxsize
    maxValue = -sys.maxsize - 1
    ans = sys.maxsize

    for item in A:
        if item > maxValue:
            maxValue = item
        elif item < minValue:
            minValue = item
    
    maxIndex = -1
    minIndex = -1

    for i in range(len(A)):
        if A[i] == maxValue:
            if minIndex != -1:
                ans = min(ans, (i - minIndex + 1))
            maxIndex = i
        elif A[i] == minValue:
            if maxIndex != -1:
                ans = min(ans, (i - maxIndex + 1))
            minIndex = i

    return ans


A = [2, 6, 1, 6, 9]
result = finMinMaxInSubArray(A)
print('result:', result)