# Problem Description
# Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
# The digits are stored such that the most significant digit is at the head of the list.
# NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
# For example: for this problem, the following are some good questions to ask :

# Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
# A: For the purpose of this question, YES
# Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
# A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

# Problem Constraints
# 1 <= size of the array <= 1000000
# Input Format
# First argument is an array of digits.

# Output Format
# Return the array of digits after adding one.

# Example Input
# Input 1:
# [1, 2, 3]

# Example Output
# Output 1:
# [1, 2, 4]

# Example Explanation
# Explanation 1:
# Given vector is [1, 2, 3].
# The returned vector should be [1, 2, 4] as 123 + 1 = 124.

#scalar code
# def addOneTONumber(A):
#     A[-1] += 1
#     temp = 0
#     tempSum = 0
#     # traversing the digits of the number in reverse order
#     for i in range(len(A) - 1, -1, -1):
#         tempSum = A[i] + temp
#         print(tempSum)
#         temp = (A[i] + temp) // 10
#         print(temp)
#         A[i] = tempSum % 10
#         print(A[i])
#     if temp > 0:
#         print(temp, 'temp')
#         A = [temp] + A
#         print(A, 'yfghghfh')
#     i = 0
#     while i < len(A):
#         if A[i] > 0:
#             break
#         i += 1
#     return A[i:]

def addOneTONumber(A):
    A = A[::-1]
    A[0] = A[0] + 1
    carry = A[0] // 10
    if carry != 0:
        A[0] = A[0] % 10
    for i in range(1, len(A)):
        if carry == 0:
            break
        else:
            A[i] = A[i] + carry
            carry = A[i] // 10
            A[i] = A[i] % 10

    A = A[::-1]

    #Skipping the initial zeros in the output
    i = 0
    while i < len(A):
        if A[i] > 0:
            break
        i += 1
        
    return A[i:]
            

A = [1, 2, 3]
result = addOneTONumber(A)
print('result:', result)