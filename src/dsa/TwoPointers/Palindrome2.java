public class Palindrome2 {
    public boolean isPalindrome(String s) {
        String string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = string.length() - 1;
        if (string.length() == 0 || string.length() == 1) return true;

        while (l < r) {
            if (string.charAt(l) != string.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
