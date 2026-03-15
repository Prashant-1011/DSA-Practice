# Problem Description
# Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
# If the answer does not exist return an array with a single integer "-1".
# First sub-array means the sub-array for which starting index in minimum.

# Problem Constraints
# 1 <= length of the array <= 100000
# 1 <= A[i] <= 109
# 1 <= B <= 109

# Input Format
# The first argument given is the integer array A.
# The second argument given is integer B.

# Output Format
# Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".

# Example Input
# Input 1:
#  A = [1, 2, 3, 4, 5]
#  B = 5

# Input 2:
#  A = [5, 10, 20, 100, 105]
#  B = 110

# Example Output
# Output 1:
#  [2, 3]

# Output 2:
#  [-1]

# Example Explanation
# Explanation 1:
#  [2, 3] sums up to 5.

# Explanation 2:
#  No subarray sums up to required number.

def subArrayWithGivenSum(A, B):
    n = len(A)
    i = j = 0
    list = []
    sum = A[0]
    flag = False
    
    while j < n and i < n:
        if sum == B:
            # current window sum = B
            flag = True
            break

        elif sum < B:
            # current window sum < B
            if j + 1 == n:
                break
            j = j + 1
            sum = sum + A[j]

        else:
            # current window sum > B
            if i + 1 == n:
                break
            i = i + 1
            sum = sum - A[i - 1]

    if flag == False:
        return [-1]

    for k in range(i, j + 1):
        list.append(A[k])

    return list

A = [1, 2, 3, 4, 5]
B = 5
# A = [5, 10, 20, 100, 105]
# B = 110
result = subArrayWithGivenSum(A, B)
print('result:', result)