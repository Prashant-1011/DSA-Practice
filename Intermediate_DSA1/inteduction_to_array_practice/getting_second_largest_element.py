# Problem Description
# You are given an integer array A.
# You have to find the second largest element/value in the array or report that no such element exists.

# Problem Constraints
# 1 <= |A| <= 105
# 0 <= A[i] <= 109

# Input Format
# The first argument is an integer array A.

# Output Format
# Return the second largest element. If no such element exist then return -1.

# Example Input
# Input 1:
#  A = [2, 1, 2] 
# Input 2:
#  A = [2]

# Example Output
# Output 1:
#  1 
# Output 2:
#  -1 

# Example Explanation
# Explanation 1:
#  First largest element = 2
#  Second largest element = 1

# Explanation 2:
#  There is no second largest element in the array.

def findSecondLargestElement(A):
    A.sort()
    max = A[len(A)-1]
    ans = -1

    if len(A) == 1:
        return ans

    for i in range(len(A) - 2, -1, -1):
        if A[i] == max:
            continue
        if A[i] != max: 
            ans = A[i]
            break
    return ans

A = [2]    
result = findSecondLargestElement(A)
print(result)

def findSecondLargestElement2(A):
        second_largest = float('-inf')
        first_largest = second_largest + 1
        if len(A) == 1:
            return -1

        for item in A:
            if item > first_largest:
                second_largest = first_largest
                first_largest = item
            elif item > second_largest and item != first_largest:
                second_largest = item
        if second_largest == float('-inf'):
            return -1
        return second_largest

result2 = findSecondLargestElement2(A)
print(result2)