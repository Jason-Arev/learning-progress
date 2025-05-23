import java.util.HashMap;
import java.util.Stack;
class ValidParenthesis {
    private final HashMap<Character, Character> mappings;

    public ValidParenthesis() {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if(this.mappings.containsKey(c)) {
                char top;
                if (stack.isEmpty()) {
                    top = '#';
                } else {
                    top = stack.pop();
                }

                if (top != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }    
        return stack.isEmpty();
    }
}