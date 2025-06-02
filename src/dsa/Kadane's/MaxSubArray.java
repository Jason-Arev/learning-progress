public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int curSub = nums[0];
        int maxSub = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            curSub = Math.max(num, curSub + num);
            maxSub = Math.max(maxSub, curSub);
        }
        return maxSub;
    }
}
