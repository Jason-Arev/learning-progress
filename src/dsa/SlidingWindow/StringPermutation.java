import java.util.Arrays;

public class StringPermutation {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        // frequency map for s1
        for (char c : s1.toCharArray()) {
            s1Map[c - 'a']++;
        }

        // first window in s2
        for (int i = 0; i < s1.length(); i++) {
            s2Map[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Map, s2Map)) return true;

        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Map[s2.charAt(i) - 'a']++; // add new char
            s2Map[s2.charAt(i - s1.length()) - 'a']--; // remove old char

            if (Arrays.equals(s1Map, s2Map)) return true;
        }

        return false;
    }
}
