# Problem Description
# Given an array A of N integers.
# Find the length of the longest subarray in the array which sums to zero.
# If there is no subarray which sums to zero then return 0.

# Problem Constraints
# 1 <= N <= 105
# -109 <= A[i] <= 109

# Input Format
# Single argument which is an integer array A.

# Output Format
# Return an integer.

# Example Input
# Input 1:
#  A = [1, -2, 1, 2]

# Input 2:
#  A = [3, 2, -1]

# Example Output
# Output 1:
# 3

# Output 2:
# 0

# Example Explanation
# Explanation 1:
#  [1, -2, 1] is the largest subarray which sums up to 0.

# Explanation 2:
#  No subarray sums up to 0.

def longestSubarraySumZero(A):
    myDict = {}
    ps = 0
    myDict[0] = 0
    ans = 0
    for i in range(1,len(A) + 1):
        ps += A[i - 1]
        if ps in myDict:
            ans = max(ans, i - myDict[ps])
        else:
            myDict[ps] = i

    return ans



A = [1, -2, 1, 2, -2]
result = longestSubarraySumZero(A)