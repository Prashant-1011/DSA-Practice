# Problem Description
# Given a string A, you are asked to reverse the string and return the reversed string.

# Problem Constraints
# 1 <= |A| <= 105
# String A consist only of lowercase characters.

# Input Format
# First and only argument is a string A.

# Output Format
# Return a string denoting the reversed string.

# Example Input
# Input 1:
#  A = "scaler"

# Input 2:
#  A = "academy"

# Example Output
# Output 1:
#  "relacs"

# Output 2:
#  "ymedaca"

# Example Explanation
# Explanation 1:
#  Reverse the given string.


def reverseString(S):
    S = list(S)
    i = 0
    j = len(S) - 1

    while(i < j):
        temp = S[i]
        S[i] = S[j]
        S[j] = temp
        i += 1
        j -= 1

    S = ''.join(S)

    return S

S = 'scaler'
result = reverseString(S)
print(result, 'result')