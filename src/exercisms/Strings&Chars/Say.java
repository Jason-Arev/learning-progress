import java.util.*;

public class Say {
    private static final String[] belowTwenty = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] scales = {
        "", " thousand", " million", " billion"
    };

    public String say(long number) {
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999");
        }

        if (number == 0) return "zero";

        List<String> parts = new ArrayList<>();
        int scaleIdx = 0;

        while (number > 0) {
            int chunk = (int)(number % 1000);
            if (chunk > 0) {
                parts.add(0, sayUnder1000(chunk) + scales[scaleIdx]);
            }
            number /= 1000;
            scaleIdx++;
        }

        return String.join(" ", parts).trim();
    }

    private String sayUnder1000(int num) {
        List<String> parts = new ArrayList<>();

        if (num >= 100) {
            parts.add(belowTwenty[num / 100] + " hundred");
            num %= 100;
        }

        if (num >= 20) {
            parts.add(tens[num / 10] + (num % 10 == 0 ? "" : "-" + belowTwenty[num % 10]));
        } else if (num > 0) {
            parts.add(belowTwenty[num]);
        }

        return String.join(" ", parts);
    }
}