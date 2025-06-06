import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c != ' ') {
                word.append(c);
            } else if (word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0); // clear for next word
            }
        }
        
        // Push the last word if there is one
        if (word.length() > 0) {
            stack.push(word.toString());
        }
        
        // Build the reversed sentence
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
