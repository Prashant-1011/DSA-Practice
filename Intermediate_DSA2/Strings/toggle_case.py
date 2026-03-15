# Problem Description
# You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
# You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.

# Problem Constraints
# 1 <= N <= 105
# A[i] ∈ ['a'-'z', 'A'-'Z']

# Input Format
# First and only argument is a character string A.

# Output Format
# Return a character string.

# Example Input
# Input 1:
#  A = "Hello" 

# Input 2:
#  A = "tHiSiSaStRiNg" 

# Example Output
# Output 1:
#  hELLO 

# Output 2:
#  ThIsIsAsTrInG 

# Example Explanation
# Explanation 1:
#  'H' changes to 'h'
#  'e' changes to 'E'
#  'l' changes to 'L'
#  'l' changes to 'L'
#  'o' changes to 'O'

# Explanation 2:
#  "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".

def toggleCasse(string):
    strList = list(string)
    n = len(strList)
    for i in range(n):
        strList[i] = chr(ord(strList[i]) ^ (1 << 5))

    return ''.join(strList)

# Scalar solution 
# def toggleCasse(A):
#     s = ''
#     for c in A:
#         if c >= 'A' and c <= 'Z':
#             s = s + chr((ord(c) + 32))
#         else:
#             s = s + chr((ord(c) - 32))
#     return s

string = "Hello"
string = "tHiSiSaStRiNg" 
result = toggleCasse(string)
print(result, 'result')