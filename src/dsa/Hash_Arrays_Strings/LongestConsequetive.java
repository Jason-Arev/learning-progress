import java.util.HashSet;
import java.util.Set;

class LongestConsequetive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        int max = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }
}