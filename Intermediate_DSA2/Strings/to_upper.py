# Problem Description
# You are given a function to_upper() consisting of a character array A.
# Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist,
# it remains unmodified.
# The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.
# Return the uppercase version of the given character array.

# Problem Constraints
# 1 <= |A| <= 105

# Input Format
# Only argument is a character array A.

# Output Format
# Return the uppercase version of the given character array.

# Example Input
# Input 1:
#  A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']

# Input 2:
#  A = ['S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0']

# Example Output
# Output 1:
#  ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']

# Output 2:
#  ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']

# Example Explanation
# Explanation 1:
#  All the characters in the returned array are in uppercase alphabets.

# Explanation 2:
#  Since there is no Uppercase version for '#', '2'and '0'.  It remains unchanged.
#  Rest of the Lowercase alphabets are converted to Uppercase accordingly.

def toUpper(A):
    n = len(A)
    for i in range(n):
        if ord(A[i]) >= 97 and ord(A[i]) <= 122:
            A[i] = chr(ord(A[i]) ^ (1 << 5))

    return A

A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
# A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']
result = toUpper(A)
print(result, 'result')