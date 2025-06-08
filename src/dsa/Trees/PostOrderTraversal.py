from typing import List, Optional
# Definition for a binary tree node.
class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.postOrderHelper(root, res)
        return res

    def postOrderHelper(self, currNode, res):
        if not currNode:
            return
        self.postOrderHelper(currNode.left, res)
        self.postOrderHelper(currNode.right, res)
        res.append(currNode.val)