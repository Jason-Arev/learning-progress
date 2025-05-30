public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int r = numbers.length - 1;
        int l = 0;
        

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l + 1, r + 1};
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{};
    }
}
