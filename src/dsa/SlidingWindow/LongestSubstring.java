import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++; // shrink window from the left
            }

            seen.add(current);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
