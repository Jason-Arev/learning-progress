public class RomanToInt {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = converted(s.charAt(i));
            int next = (i + 1 < s.length()) ? converted(s.charAt(i + 1)) : 0;

            // If the current is smaller than the next, subtract it
            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

    private int converted(char c) {
        return switch(c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
