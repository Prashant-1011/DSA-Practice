# Problem Description
# Given two binary strings A and B. Return their sum (also a binary string).

# Problem Constraints
# 1 <= length of A <= 105
# 1 <= length of B <= 105
# A and B are binary strings

# Input Format
# The two argument A and B are binary strings.

# Output Format
# Return a binary string denoting the sum of A and B

# Example Input
# Input 1:
# A = "100"
# B = "11"

# Input 2:
# A = "110"
# B = "10"

# Example Output
# Output 1:
# "111"

# Output 2:
# "1000"

# Example Explanation
# For Input 1:
# The sum of 100 and 11 is 111.

# For Input 2:
# The sum of 110 and 10 is 1000.

def addBinaryStrings(A, B):
    decimalNum1 = int(A, 2)
    decimalNum2 = int(B, 2)

    decimalSum = decimalNum1 + decimalNum2

    return bin(decimalSum)[2:]


# scalar code
def get(x):
    if x == 0:
        return "0"
    if x == 1:
        return "1"
    
def addBinary(A, B):
    n = -len(A)
    m = -len(B)
    nm = min(n, m)
    carry = 0
    ans = ""
    # we add bits from the rightmost bit to the leftmost bit
    for i in range(-1, nm - 1, -1):
        if i >= n and i >= m:
            v = ord(A[i]) + ord(B[i]) - 2 * ord('0') + carry
            carry = v // 2
            v -= 2 * carry
            ans += get(v)
        elif i >= n:
            v = ord(A[i]) - ord('0') + carry
            carry = v // 2
            v -= 2 * carry
            ans += get(v)
        else:
            v = ord(B[i]) - ord('0') + carry
            carry = v // 2
            v -= 2 * carry
            ans += get(v)
    if carry == 1:
        ans += get(carry)
    return ans[::-1]

A = "100"
B = "11"
# A = "110"
# B = "10"
result = addBinaryStrings(A, B)
print(result, 'result')