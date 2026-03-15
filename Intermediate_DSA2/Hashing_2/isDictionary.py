# Problem Description
# Surprisingly, in an alien language, they also use English lowercase letters,
# but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
# Given an array of words A of size N written in the alien language,
# and the order of the alphabet denoted by string B of size 26,
# return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.

# Problem Constraints
# 1 <= N, length of each word <= 105
# Sum of the length of all words <= 2 * 106

# Input Format
# The first argument is a string array A of size N.
# The second argument is a string B of size 26, denoting the order.

# Output Format
# Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.

# Example Input
# Input 1:
#  A = ["hello", "scaler", "interviewbit"]
#  B = "adhbcfegskjlponmirqtxwuvzy"

# Input 2:
#  A = ["fine", "none", "bush"]
#  B = "qwertyuiopasdfghjklzxcvbnm"

# Example Output
# Output 1:
#  1

# Output 2:
#  0

# Example Explanation
# Explanation 1:
#  The order shown in string B is: h < s < i (adhbcfegskjlponmirqtxwuvzy) for the given words. 
#  So, Return 1.

# Explanation 2:
#  "none" should be present after "bush", Since b < n (qwertyuiopasdfghjklzxcvbnm). 
#  So, Return 0.

def isDictionary(A, B):
    n = len(A)
    index = [0] * 26
    for i in range(len(B)):
        print(ord(B[i]))
        index[ord(B[i]) - 97] = i

    print(index)
    for i in range(len(A)-1):
        word1 = A[i]
        word2 = A[i+1]
        flag = 0
        for k in range(min(len(word1), len(word2))):
            if(word1[k] != word2[k]):
                if(index[ord(word1[k]) - 97] > index[ord(word2[k]) - 97]):
                    return 0
                flag = 1
                break
            
        if(flag == 0):
            if(len(word1) > len(word2)):
                return 0
            
    return 1

A = ["fine", "none", "bush"]
B = "qwertyuiopasdfghjklzxcvbnm"
A = ["hello", "scaler", "interviewbit"]
B = "adhbcfegskjlponmirqtxwuvzy"
result = isDictionary(A, B)
print(result)