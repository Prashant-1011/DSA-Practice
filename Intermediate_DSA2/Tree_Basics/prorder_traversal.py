# Problem Description
# Given a binary tree, return the preorder traversal of its nodes values.

# Problem Constraints
# 1 <= number of nodes <= 105

# Input Format
# First and only argument is root node of the binary tree, A.

# Output Format
# Return an integer array denoting the preorder traversal of the given binary tree.

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
#  [1, 2, 3]

# Output 2:
#  [1, 6, 2, 3]

# Example Explanation
# Explanation 1:
#  The Preoder Traversal of the given tree is [1, 2, 3].

# Explanation 2:
#  The Preoder Traversal of the given tree is [1, 6, 2, 3].

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

resulList = []
def preOrderTraverse(root):
    if not root:
        return
    resulList.append(root.data)
    preOrderTraverse(root.left)
    preOrderTraverse(root.right)

    return resulList

root = TreeNode(1)
node1 = TreeNode(2)
node2 = TreeNode(3)
# node3 = TreeNode(6)

root.right = node1
# root.left = node3
node1.left = node2

result = preOrderTraverse(root)
print('result:', result)