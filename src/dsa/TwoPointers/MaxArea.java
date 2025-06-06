public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            if (height[l] < height[r]) {
                l++;
            } else r--;
            max = Math.max(max, area);
        }
        return max;
    }
}
