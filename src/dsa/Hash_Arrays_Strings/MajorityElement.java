import java.util.*;

public class MajorityElement {
    //countNums method that returns a new map with the vals representing amount of occurences of a key
    private Map<Integer, Integer> countNums(int[] nums) { 
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1); //adds occurence of the key
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums); 

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            //returns the key that takes up most of the entries
            if (entry.getValue() > nums.length / 2) return entry.getKey(); 
        }
        throw new IllegalArgumentException("No majority element found");
    }
}
