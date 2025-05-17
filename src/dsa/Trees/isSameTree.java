
    public class isSameTree {
        
        @SuppressWarnings("unused")
        public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; 
            this.left = left;
            this.right = right;
        }
    }

        public boolean isSameTreeChecker(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            return isSameTreeChecker(p.left, q.left) && isSameTreeChecker(p.right, q.right);
        }
}
