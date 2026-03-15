# Problem Description
# You are given the head of a linked list A and an integer B, check if there is any node which contains this value B.
# Return 1 if such a node is present else return 0.

# Problem Constraints
# 1 <= size of linked list <= 105
# 1 <= value of nodes <= 109
# 1 <= B <= 109

# Input Format
# The first argument A is the head of a linked list.
# The second arguement B is an integer.

# Output Format
# Return 1 if such a node is present otherwise return 0.

# Example Input
# Input 1:
# A = 1 -> 2 -> 3
# B = 4

# Input 2:
# A = 4 -> 3 -> 2 -> 1
# B = 4

# Example Output
# Output 1:
# 0

# Output 2:
# 1

# Example Explanation
# For Input 1:
# None of the nodes have a value 4.

# For Input 2:
# The first node has a value 4.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def searchInLinkedList(head, B):
    current = head
    while current:
        if current.data == B:
            return 1
        current = current.next

    return 0

node1 = Node(2)
node2 = Node(3)
node3 = Node(1)
node4 = Node(4)

node1.next = node2
node2.next = node3
node3.next = node4

B = 4

result = searchInLinkedList(node1, B)
print('result:', result)