import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private final String word;

    private static final Map<Character, Integer> letterScores = new HashMap<>();

    static {
        // Set up the letter scores
        for (char c : "AEIOULNRST".toCharArray()) letterScores.put(c, 1);
        for (char c : "DG".toCharArray()) letterScores.put(c, 2);
        for (char c : "BCMP".toCharArray()) letterScores.put(c, 3);
        for (char c : "FHVWY".toCharArray()) letterScores.put(c, 4);
        letterScores.put('K', 5);
        for (char c : "JX".toCharArray()) letterScores.put(c, 8);
        for (char c : "QZ".toCharArray()) letterScores.put(c, 10);
    }

    public Scrabble(String word) {
        this.word = word == null ? "" : word;
    }

    public int getScore() {
        int score = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            score += letterScores.getOrDefault(c, 0);
        }
        return score;
    }
}