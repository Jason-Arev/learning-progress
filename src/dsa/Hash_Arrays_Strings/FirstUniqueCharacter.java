import java.util.*;

class FirstUniqueCharacter {
    public int firstUniqueCharacter(String s) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars.containsKey(c)) {
                chars.put(c, -1);
            }
            chars.put(c, i);
        }
            for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() != -1) {
                return entry.getValue();
            }
        }
        return -1;
    }
}
