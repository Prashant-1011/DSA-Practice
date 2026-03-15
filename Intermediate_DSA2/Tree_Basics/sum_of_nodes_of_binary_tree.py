# Problem Description
# Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.

# Problem Constraints
# 1 <= Number of nodes in A <= 104
# 1 <= value of each node <= 104

# Input Format
# First argument is the root of binary tree A.

# Output Format
# Return an integer denoting the sum of all the nodes

# Example Input
# Input 1:
#  A =   2                 
#       / \                           
#      1   4            
#     /                           
#    5

# Input 2:
# A =   3
#       / \
#       6  1
#       \   \
#        2   7

# Example Output
# Output 1:
# 12

# Output 2:
# 19

# Example Explanation
# Explanation 1:
# The sum of all the nodes is 12

# Explanation 2:
# The sum of all the nodes is 19

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def sumOfNodes(root):
    if not root:
        return 0
    
    return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data

root = TreeNode(2)
node1 = TreeNode(4)
node2 = TreeNode(1)
node3 = TreeNode(5)

root.right = node1
root.left = node2
node2.left = node3


result = sumOfNodes(root)
print('result:', result)