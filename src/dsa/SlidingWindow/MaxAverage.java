public class MaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; //remove old val; add new
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    } 
}
