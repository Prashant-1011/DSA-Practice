# Problem Description
# Given an array A of N integers. 
# Count the number of elements that have at least 1 elements greater than itself.

# 1 <= N <= 105
# 1 <= A[i] <= 109

# Example Input
# Input 1:
# A = [3, 1, 2]
# Input 2:
# A = [5, 5, 3]

# Example Output
# Output 1:
# 2
# Output 2:
# 1

import sys
list = [3, 1, 2, 3]
def findElement(list):
    mc = -sys.maxsize - 1
    count = 0
    for i in range(len(list)):
        if (list[i] > mc):
            mc = list[i]
            count = 1
        elif(mc == list[i]):
            count += 1
  
    return len(list) - count

result = findElement(list)
print(result, 'dkjlgjdklgj')

# Problem Description
# Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
# Check if any good pair exist or not.

# Problem Constraints
# 1 <= A.size() <= 104
# 1 <= A[i] <= 109
# 1 <= B <= 109

# Input Format

# First argument is an integer array A.
# Second argument is an integer B.

# Output Format
# Return 1 if good pair exist otherwise return 0.

# Example Input
# Input 1:
# A = [1,2,3,4]
# B = 7
# Input 2:
# A = [1,2,4]
# B = 4
# Input 3:
# A = [1,2,2]
# B = 4


# Example Output
# Output 1:
# 1
# Output 2:
# 0
# Output 3:
# 1

A = [1,2,4]
B = 4
def goodPair(A, B):
    for i in range(1, len(A)):
        for j in range(i):
            if (A[i] + A[j] == B):
                return 1
    
    return 0

reuslt = goodPair(A, B)
print(reuslt)

# Problem Description
# Given an array A of N integers and also given two integers B and C.
# Reverse the elements of the array A within the given inclusive range [B, C].

# Problem Constraints
# 1 <= N <= 105
# 1 <= A[i] <= 109
# 0 <= B <= C <= N - 1

# Input Format
# The first argument A is an array of integer.
# The second and third arguments are integers B and C

# Output Format
# Return the array A after reversing in the given range.

# Example Input
# Input 1:
# A = [1, 2, 3, 4]
# B = 2
# C = 3

# Input 2:
# A = [2, 5, 6]
# B = 0
# C = 2

# Example Output
# Output 1:
# [1, 2, 4, 3]
# Output 2:
# [6, 5, 2]

A = [2, 5, 6]
B = 0
C = 2
def reverse(A, B, C):
    i = B
    j = C
    while(i < j):
        temp = A[i]
        A[i] = A[j]
        A[j] = temp
        i += 1
        j -= 1
    return A

# result = reverse(A, B, C)
# print(result)

# Problem Description
# You are given a constant array A.
# You are required to return another array which is the reversed form of the input array.

# Problem Constraints
# 1 <= A.size() <= 10000
# 1 <= A[i] <= 10000

# Input Format
# First argument is a constant array A.

# Output Format
# Return an integer array.

# Example Input
# Input 1:
# A = [1,2,3,2,1]
# Input 2:
# A = [1,1,10]

# Example Output
# Output 1:
# [1,2,3,2,1] 
# Output 2:
# [10,1,1]

A = [1,1,10]
def reverseArray(A):
    i = 0
    j = len(A) - 1
    while(i < j):
        temp = A[i]
        A[i] = A[j]
        A[j] = temp
        i += 1
        j -= 1
    return A

result = reverseArray(A)
print(result)

# Problem Description
# Given an integer array A of size N and an integer B,
# you have to return the same array after rotating it B times towards the right.

# Problem Constraints
# 1 <= N <= 105
# 1 <= A[i] <=109
# 1 <= B <= 109

# Input Format
# The first argument given is the integer array A.
# The second argument given is the integer B.

# Output Format
# Return the array A after rotating it B times to the right

# Example Input
# Input 1:
# A = [1, 2, 3, 4]
# B = 2
# Input 2:
# A = [2, 5, 6]
# B = 1

# Example Output
# Output 1:
# [3, 4, 1, 2]
# Output 2:
# [6, 2, 5]

A = [2, 5, 6]
B = 1
def rotateArray(A, B):
    if B >= len(A):
        B %= len(A)

    A = reverseArray(A)

    # reverse first B elements
    A = reverse(A, 0, B-1)

    #reverse next elsments
    A = reverse(A, B, len(A) - 1)

    return A

result = rotateArray(A, B)
print(result)