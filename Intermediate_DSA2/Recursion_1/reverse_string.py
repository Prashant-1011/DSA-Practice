# Problem Description
# Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.

# Problem Constraints
# 1 <= |s| <= 1000

# Input Format
# First line of input contains a string S.

# Output Format
# Print the character of the string S in reverse order.

# Example Input
# Input 1:
#  scaleracademy

# Input 2:
#  cool

# Example Output
# Output 1:
#  ymedacarelacs

# Output 2:
#  looc

def reverseString(S):

    if len(S) == 0:
        return
    
    temp = S[0]
    print(temp) 
    reverseString(S[1:]) 
    print(temp, end='')

S = "scaleracademy"
reverseString(S)