# Problem Description
# Given a binary tree, return the inorder traversal of its nodes' values.

# Problem Constraints
# 1 <= number of nodes <= 105

# Input Format
# First and only argument is root node of the binary tree, A.

# Output Format
# Return an integer array denoting the inorder traversal of the given binary tree.

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
#  [1, 3, 2]

# Output 2:
#  [6, 1, 3, 2]

# Example Explanation
# Explanation 1:
#  The Inorder Traversal of the given tree is [1, 3, 2].

# Explanation 2:
#  The Inorder Traversal of the given tree is [6, 1, 3, 2].

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

resulList = []
def inOrderTraverse(root):
    if not root:
        return
    inOrderTraverse(root.left)
    resulList.append(root.data)
    inOrderTraverse(root.right)

    return resulList

root = TreeNode(1)
node1 = TreeNode(2)
node2 = TreeNode(3)
# node3 = TreeNode(6)

root.right = node1
# root.left = node3
node1.left = node2

result = inOrderTraverse(root)
print('result:', result)


# <?php
# // ...existing code...
# <?php
# class TreeNode {
#     public $data;
#     public $left;
#     public $right;
#     public function __construct($data) {
#         $this->data = $data;
#         $this->left = null;
#         $this->right = null;
#     }
# }

# /**
#  * Iterative inorder traversal (returns array of node values)
#  */
# function inOrderTraverse($root) {
#     $result = [];
#     $stack = [];
#     $current = $root;

#     while ($current !== null || !empty($stack)) {
#         while ($current !== null) {
#             array_push($stack, $current);
#             $current = $current->left;
#         }
#         $node = array_pop($stack);
#         $result[] = $node->data;
#         $current = $node->right;
#     }

#     return $result;
# }

# // Example tree:
# //    1
# //     \
# //      2
# //     /
# //    3
# $root = new TreeNode(1);
# $node1 = new TreeNode(2);
# $node2 = new TreeNode(3);

# $root->right = $node1;
# $node1->left = $node2;

# $result = inOrderTraverse($root);
# echo json_encode($result) . PHP_EOL;
# ?>
