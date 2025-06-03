@SuppressWarnings("unused")
class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        // Remove all dashes
        String clean = stringToVerify.replace("-", "");

        // ISBN-10 must be exactly 10 characters
        if (clean.length() != 10) return false;

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            char c = clean.charAt(i);
            int value;

            // Handle last character which can be 'X'
            if (i == 9 && c == 'X') {
                value = 10;
            } else if (Character.isDigit(c)) {
                value = Character.getNumericValue(c);
            } else {
                return false; // Invalid character
            }

            sum += value * (10 - i);
        }

        return sum % 11 == 0;
    }
}
