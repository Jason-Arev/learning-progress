import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    // Main method to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group words by their sorted character form
        Map<String, List<String>> anagram = new HashMap<>();

        // Loop through each word in the input array
        for (String s : strs) {
            // Convert the word into a sorted string to use as a grouping key
            String key = sortString(s);

            // If the key doesn't exist in the map yet, create a new list for it
            anagram.putIfAbsent(key, new ArrayList<>());

            // Add the original word to the list of its corresponding anagram group
            anagram.get(key).add(s);
        }

        // Return all the grouped lists of anagrams
        return new ArrayList<>(anagram.values());
    }

    // Helper method to sort the characters of a string alphabetically
    private String sortString(String s) {
        char[] chars = s.toCharArray();  // Convert the string to a char array
        Arrays.sort(chars);              // Sort the characters
        return new String(chars);        // Convert back to a string and return
    }
}
