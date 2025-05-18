import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    public List<Integer> scores = new ArrayList<>();
    public List<Integer> highScores = new ArrayList<>();

    public HighScores(List<Integer> scores) {
        this.scores = new ArrayList<>(scores);          
        this.highScores = new ArrayList<>(scores);       
    }

    public void addNewScore(int score) {
        scores.add(score);
        if (isHighScore(score)) {
            highScores.add(score);
        }
    }

    public boolean isHighScore(int newScore) {
        for (int oldScore : scores) {
            if (newScore <= oldScore) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> scores() {
        return scores;
    }

    public Integer latest() {
        return scores.get(scores.size() - 1);
    }

    public Integer personalBest() {
        List<Integer> temp = new ArrayList<>(highScores);
        Collections.sort(temp);
        return temp.get(temp.size() - 1);
    }

    public List<Integer> personalTopThree() {
        List<Integer> temp = new ArrayList<>(highScores);
        Collections.sort(temp, Collections.reverseOrder());
        return temp.subList(0, Math.min(3, temp.size()));
    }
}
