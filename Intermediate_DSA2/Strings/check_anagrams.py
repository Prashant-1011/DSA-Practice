# Problem Description
# You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.
# Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.

# Problem Constraints
# 1 <= N <= 105
# A and B are lowercase strings

# Input Format
# Both arguments A and B are a string.

# Output Format
# Return 1 if they are anagrams and 0 if not

# Example Input
# Input 1:
# A = "cat"
# B = "bat"

# Input 2:
# A = "secure"
# B = "rescue"

# Example Output
# Output 1:
# 0

# Output 2:
# 1

# Example Explanation
# For Input 1:
# The words cannot be rearranged to form the same word. So, they are not anagrams.

# For Input 2:
# They are an anagram.

def checkAnagrams(A, B):
    freq1 = [0]*26
    freq2 = [0]*26
    for i in range(len(A)):
        freq1[ord(A[i]) - ord('a')] += 1
        freq2[ord(B[i]) - ord('a')] += 1
    for i in range(26):
        if freq1[i] != freq2[i]:
            return 0
    return 1

A = "cat"
B = "bat"
# A = "secure"
# B = "rescue"
result = checkAnagrams(A, B)
print(result, 'result')