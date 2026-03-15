# Problem Description
# Given a binary tree, return the Postorder traversal of its nodes values.

# Problem Constraints
# 1 <= number of nodes <= 105

# Input Format
# First and only argument is root node of the binary tree, A.

# Output Format
# Return an integer array denoting the Postorder traversal of the given binary tree.

# Example Input
# Input 1:
#    1
#     \
#      2
#     /
#    3

# Input 2:
#    1
#   / \
#  6   2
#     /
#    3

# Example Output
# Output 1:
#  [3, 2, 1]

# Output 2:
#  [6, 3, 2, 1]

# Example Explanation
# Explanation 1:
#  The Preoder Traversal of the given tree is [3, 2, 1].

# Explanation 2:
#  The Preoder Traversal of the given tree is [6, 3, 2, 1].

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

resulList = []
def postOrderTraverse(root):
    if not root:
        return
    
    postOrderTraverse(root.left)
    postOrderTraverse(root.right)
    resulList.append(root.data)

    return resulList

root = TreeNode(1)
node1 = TreeNode(2)
node2 = TreeNode(3)
# node3 = TreeNode(6)

root.right = node1
# root.left = node3
node1.left = node2

result = postOrderTraverse(root)
print('result:', result)