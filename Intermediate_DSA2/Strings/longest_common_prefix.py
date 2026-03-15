# Problem Description
# Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
# The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
# Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
# Problem Constraints
# 0 <= sum of length of all strings <= 1000000

# Input Format
# The only argument given is an array of strings A.

# Output Format
# Return the longest common prefix of all strings in A.

# Example Input
# Input 1:
# A = ["abcdefgh", "aefghijk", "abcefgh"]

# Input 2:
# A = ["abab", "ab", "abcd"];

# Example Output
# Output 1:
# "a"

# Output 2:
# "ab"

# Example Explanation
# Explanation 1:
# Longest common prefix of all the strings is "a".

# Explanation 2:
# Longest common prefix of all the strings is "ab".

def longestCommonPrefix(S):
    compareString = ''
    str1 = S[0]
    str2 = S[1]

    n = len(str1) if len(str1) < len(str2) else len(str2)

    for i in range(n):
        if str1[i] != str2[i]:
            break
        compareString += str1[i]

    for i in range(2, len(S)):
        for j in range(len(compareString)):
            if S[i][j] != compareString[j]:
                return ''
            
    return compareString

S = ["abab", "ab", "abcd"]
result = longestCommonPrefix(S)
print(result, 'result')