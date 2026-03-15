# Problem Description
# You are given the root node of a binary tree A. You have to find the number of nodes in this tree.

# Problem Constraints
# 1 <= Number of nodes in the tree <= 105
# 0 <= Value of each node <= 107

# Input Format
# The first and only argument is a tree node A.

# Output Format
# Return an integer denoting the number of nodes of the tree.

# Example Input
# Input 1:
#  Values =  1 
#           / \     
#          4   3                        

# Input 2:
#  Values =  1      
#           / \     
#          4   3                       
#         /         
#        2                                     

# Example Output
# Output 1:
#  3 

# Output 2:
#  4 

# Example Explanation
# Explanation 1:
# Clearly, there are 3 nodes 1, 4 and 3.

# Explanation 2:
# Clearly, there are 4 nodes 1, 4, 3 and 2.

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def nodeCount(root):
    if not root:
        return 0
    
    return nodeCount(root.left) + nodeCount(root.right) + 1

root = TreeNode(1)
node1 = TreeNode(4)
node2 = TreeNode(3)
# node3 = TreeNode(2)

root.right = node2
root.left = node1
# node1.left = node3


result = nodeCount(root)
print('result:', result)
