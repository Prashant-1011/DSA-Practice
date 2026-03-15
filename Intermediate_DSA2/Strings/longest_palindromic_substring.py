# Problem Description
# Given a string A of size N, find and return the longest palindromic substring in A.
# Substring of string A is A[i...j] where 0 <= i <= j < len(A)

# Palindrome string:
# A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
# Incase of conflict, return the substring which occurs first ( with the least starting index).

# Problem Constraints
# 1 <= N <= 6000

# Input Format
# First and only argument is a string A.

# Output Format
# Return a string denoting the longest palindromic substring of string A.

# Example Input
# Input 1:
# A = "aaaabaaa"

# Input 2:
# A = "abba

# Example Output
# Output 1:
# "aaabaaa"

# Output 2:
# "abba"

# Example Explanation
# Explanation 1:
# We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".

# Explanation 2:
# We can see that longest palindromic substring is of length 4 and the string is "abba".

def expandString(S, L, R):
    n = len(S)
    while(L >= 0 and R < n):
        if (S[L] != S[R]):
            break
        L -= 1
        R += 1
    
    return S[L+1:R]

def longestPalindromicSubstring(S):
    n = len(S)
    if n == 0:
        return ''
    
    ans = ''
    for i in range(n):
        expandReuslt1 = expandString(S, i-1, i+1)
        if len(expandReuslt1) > len(ans):
            ans = expandReuslt1

        expandReuslt2 = expandString(S, i, i+1)
        if len(expandReuslt2) > len(ans):
            ans = expandReuslt2

    return ans

S = "aaaabaaa"
result = longestPalindromicSubstring(S)
print(result, 'result')
