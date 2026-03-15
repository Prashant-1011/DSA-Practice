# Problem Description
# You are given A which is the head of a linked list. Print the linked list in space separated manner.
# Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line

# Problem Constraints
# 1 <= size of linked list <= 105
# 1 <= value of nodes <= 109

# Input Format
# The first argument A is the head of a linked list.

# Output Format
# You dont need to return anything

# Definition for singly-linked list.
# class ListNode:
#    def __init__(self, x):
#        self.val = x
#        self.next = None

class Solution:
    # @param A : head node of linked list
    def solve(self, A):
        while A != None:
            print(A.val, end = " ")
            A = A.next
        print()