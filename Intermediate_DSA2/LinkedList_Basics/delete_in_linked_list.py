# Problem Description
# You are given the head of a linked list A and an integer B. Delete the B-th node from the linked list.
# Note : Follow 0-based indexing for the node numbering.

# Problem Constraints
# 1 <= size of linked list <= 105
# 1 <= value of nodes <= 109
# 0 <= B < size of linked list

# Input Format
# The first argument A is the head of a linked list.
# The second arguement B is an integer.

# Output Format
# Return the head of the linked list after deletion

# Example Input
# Input 1:
# A = 1 -> 2 -> 3
# B = 1

# Input 2:
# A = 4 -> 3 -> 2 -> 1
# B = 0

# Example Output
# Output 1:
# 1 -> 3

# Output 2:
# 3 -> 2 -> 1

# Example Explanation
# For Input 1:
# The linked list after deletion is 1 -> 3.

# For Input 2:
# The linked list after deletion is 3 -> 2 -> 1.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
def size(head):
    count = 0
    current = head
    if not head:
        return 0
    while current:
        count += 1
        current = current.next
    return count

def deleteFromTheLinkedList(head, B):
    if B == 0:
        head = head.next
        return head.data
    
    if B > size(head):
        return head
    
    t = head
    for _ in range(1, B):
        t = t.next

    if t.next:
        t.next = t.next.next
    else:
        t.next = None

    return head.data

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)

node1.next = node2
node2.next = node3

B = 1
result = deleteFromTheLinkedList(node1, B)
print('result:', result)