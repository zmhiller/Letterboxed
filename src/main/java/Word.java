import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word {

    private final String word;
    private final double baseScore;
    private double adjustedScore;
    private final int uniqueLetterCount;
    private final char firstLetter, lastLetter;
    private final char[] uniqueLetterList;

    Word(String[] dictionaryLine) {
        this.word = dictionaryLine[0];
        final int rawScore = Integer.parseInt(dictionaryLine[1]);
        this.baseScore = this.adjustedScore = Double.parseDouble(dictionaryLine[2]);
        this.uniqueLetterCount = Integer.parseInt(dictionaryLine[3]);
        this.uniqueLetterList = dictionaryLine[4].toCharArray();
        this.firstLetter = word.charAt(0);
        this.lastLetter = word.charAt(word.length() - 1);
    }

    Word(String word, double score, int uniqueCount, char[] uniqueList) {
        this.word = word;
        this.baseScore = this.adjustedScore = score;
        this.uniqueLetterCount = uniqueCount;
        this.uniqueLetterList = uniqueList;
        this.firstLetter = word.charAt(0);
        this.lastLetter = word.charAt(word.length() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Double.compare(baseScore, word.baseScore) == 0 && Double.compare(adjustedScore, word.adjustedScore) == 0 && uniqueLetterCount == word.uniqueLetterCount && firstLetter == word.firstLetter && lastLetter == word.lastLetter && Objects.equals(this.word, word.word) && Objects.equals(uniqueLetterList, word.uniqueLetterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, baseScore, adjustedScore, uniqueLetterCount, firstLetter, lastLetter, uniqueLetterList);
    }

    @Override
    public String toString() { return word; }

    public char[] toCharArray() { return word.toLowerCase().toCharArray(); }

    public double getBaseScore() { return baseScore; }

    public int getUniqueLetterCount() { return uniqueLetterCount; }

    public char[] getUniqueLetterList() { return uniqueLetterList; }

    public double getAdjustedScore() { return adjustedScore; }

    public int length() { return word.length(); }

    public char getFirstLetter() { return firstLetter; }

    public char getLastLetter() { return lastLetter; }

    public void setAdjustedScore(double adjustedScore) {
        this.adjustedScore = adjustedScore;
    }

}
