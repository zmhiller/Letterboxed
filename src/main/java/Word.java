import java.util.ArrayList;
import java.util.List;

public class Word {
    private final String word;
    private final char[] letters;
    private final double baseScore;
    private double adjustedScore;

    private final List<String> uniqueLetters = new ArrayList<>();

    public Word(String[] dictionaryEntry) {
        this.word = dictionaryEntry[0];
        this.letters = this.word.toLowerCase().toCharArray();
        this.baseScore = Double.parseDouble(dictionaryEntry[1]);
        this.adjustedScore = this.baseScore;
        listUniqueLetters();
    }

    public void adjustScore(double[] weights) {
        this.adjustedScore = this.baseScore;
        for (double weight : weights) {
            this.adjustedScore *= weight;
        }
    }

    private void listUniqueLetters() {
        for (char c : this.letters) {
            if (!this.uniqueLetters.contains(String.valueOf(c))) {
                this.uniqueLetters.add(String.valueOf(c));
            }
        }
    }

    public List<String> getUniqueLetterList() {
        return uniqueLetters;
    }

    public String getUniqueLetterString() {
        String letterString = "";
        for (String s : this.uniqueLetters) {
            letterString = letterString.concat(s);
        }
        return letterString;
    }

    public int getUniqueLetterCount() {
        return this.uniqueLetters.size();
    }

    public String getWord() {
        return this.word;
    }

    public char[] getLetters() {
        return letters;
    }

    public int length() {
        return this.word.length();
    }

    public double getAdjustedScore() {
        return adjustedScore;
    }

    public String getLast() {
        return String.valueOf(this.letters[this.word.length() - 1]).toUpperCase();
    }

    public String toString() {
        return String.format("\n'%s'\n\tBase Score: %.3f\n\tAdj. Score: %.3f\n\tUnique Letters (%d): %s",
                this.word, this.baseScore, this.adjustedScore, this.uniqueLetters.size(), this.uniqueLetters);
    }
}
