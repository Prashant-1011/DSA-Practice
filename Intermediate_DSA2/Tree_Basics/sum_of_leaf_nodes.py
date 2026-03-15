# Problem Description
# Given a binary tree, find and return the sum of node value of all left leaves in it.

# Problem Constraints
# 1 <= number of nodes <= 5 * 105
# 1 <= node value <= 105

# Input Format
# First and only argument is a pointer to the root node of the Binary Tree, A.

# Output Format
# Return an integer denoting the sum of node value of all left leaves in it.

# Example Input
# Input 1:
#     3
#    / \
#   9  20
#     /  \
#    15   7

# Input 2:
#    1
#   / \
#  6   2
#     /
#    3

# Example Output
# Output 1:
#  24

# Output 2:
#  9

# Example Explanation
# Explanation 1:
#  Left leaf node in the given tree are 9 and 15. Return 24 (9 + 15).

# Explanation 2:
#  Left leaf node in the given tree are 6 and 3. Return 9 (6 + 3).

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def idLeafNode(node):
    # return True if node is a leaf node
    if node is None:
        return False
    return (node.left is None) and (node.right is None)

def sumOfleafNodes(root):
    # Initialize result
    res = 0

    # Update result if root is not None
    if root is not None:
        # If left of root is leaf node, then add val of left child
        if idLeafNode(root.left):
            # use .data (TreeNode uses data, not val)
            res += root.left.data
        else:  # Else recur for left child of root
            res += sumOfleafNodes(root.left)

        # Recur for right child of root and update res
        res += sumOfleafNodes(root.right)

    # return result
    return res

root = TreeNode(3)
node2 = TreeNode(9)
node1 = TreeNode(20)
node3 = TreeNode(15)
node4 = TreeNode(7)

# Construct the tree for sample input 1:
#     3
#    / \
#   9  20
#     /  \
#    15   7
root.left = node2
root.right = node1
node1.left = node3
node1.right = node4


result = sumOfleafNodes(root)
print('result:', result)