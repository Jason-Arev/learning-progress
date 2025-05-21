class Palindrome {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        int R = str.length() - 1;
        int L = 0;
        while (L <= R) {
            if (str.charAt(L) != str.charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }
}
