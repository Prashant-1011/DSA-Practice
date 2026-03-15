# Problem Description
# Given heads of two linked lists A and B, check if they are identical i.e. each of their corresponding nodes should contain the same data.
# The two given linked lists may or may not be of the same length.

# Problem Constraints
# 1 <= size of linked lists <= 105
# 1 <= value of each node <= 109

# Input Format
# You are given the head of two linked lists A and B.

# Output Format
# Return 1 if both the linked lists are identical and 0 otherwise

# Example Input
# Input 1:
# A = 1 -> 2 -> 3
# B = 1 -> 2 -> 3

# Input 2:
# A = 4 -> 3 -> 2 -> 1
# B = 4 -> 2 -> 3 -> 1

# Example Output
# Output 1:
# 1

# Output 2:
# 0

# Example Explanation
# For Input 1:
# Both the linked lists are identical

# For Input 2:
# The value in the second node of both the linked lists
# are different.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def compareLinkedList(A_head, B_head):
    p = A_head
    q = B_head

    if not p or not q:
        return 1
    
    while(p and q):
        if p.data != q.data:
            return 0
        p = p.next
        q = q.next

    return 1

A_Node1 = Node(1)
A_Node2 = Node(2)
A_Node3 = Node(3)
# A_Node4 = Node(4)

A_Node1.next = A_Node2
A_Node2.next = A_Node3
# A_Node3.next = A_Node4

B_Node1 = Node(1)
B_Node2 = Node(2)
B_Node3 = Node(3)
# B_Node4 = Node(4)

B_Node1.next = B_Node2
B_Node2.next = B_Node3
# B_Node3.next = B_Node4

result = compareLinkedList(A_Node1, B_Node1)
print('result:', result)