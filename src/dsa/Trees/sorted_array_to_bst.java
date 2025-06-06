
@SuppressWarnings("unused")
public class sorted_array_to_bst {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    int[] nums;

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        int m = (left + right) / 2;

        // preorder traversal
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(left, m - 1);
        root.right = helper(m + 1, right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }
}
