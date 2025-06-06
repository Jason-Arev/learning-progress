import java.util.ArrayList;
import java.util.List;

public class inorder_traversal {

    @SuppressWarnings("unused")
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    @SuppressWarnings("unused")
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorderHelper(root, result);
            return result;
        }

        private void inorderHelper(TreeNode node, List<Integer> result) {
            if (node == null) {
                return;
            }
            inorderHelper(node.left, result);
            result.add(node.val);
            inorderHelper(node.right, result);
        }
    }
}
