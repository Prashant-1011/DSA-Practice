# Problem Description
# You are given the head of a linked list A. Check if the data inside it exists in non-decreasing order.

# Problem Constraints
# 1 <= size of linked list <= 105
# 1 <= value of nodes <= 109

# Input Format
# The first argument A is the head of a linked list.

# Output Format
# Return 1 if the data of nodes is non-decreasing and 0 otherwise

# Example Input
# Input 1:
# A = 1 -> 2 -> 3 -> 3

# Input 2:
# A = 4 -> 3 -> 2 -> 1

# Example Output
# Output 1:
# 1

# Output 2:
# 0

# Example Explanation
# For Input 1:
# The data of nodes follow a non-decreasing order.

# For Input 2:
# The data of nodes are not in non-decreasing order.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def checkSortedLinkedList(head):
    if not head:
        return 1
    t = head
    while(t):
        if t.next and t.data > t.next.data:
            return 0
        t = t.next

    return 1

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)

node1.next = node2
node2.next = node3
node3.next = node4

result = checkSortedLinkedList(node1)
print('result:', result)