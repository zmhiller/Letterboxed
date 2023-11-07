import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {

    private final String wordStr, uniqueLetters = null;
    private final double baseScore;
    private double adjustedScore;
    private final int length;
    private final char firstLetter, lastLetter;

    Word(String[] dictionaryLine) {
        this.wordStr = dictionaryLine[0];
        this.baseScore = Double.parseDouble(dictionaryLine[2]);
        this.length = Integer.parseInt(dictionaryLine[3]);
        this.adjustedScore = baseScore;
        this.firstLetter = asChars()[0];
        this.lastLetter = asChars()[length - 1];
    }

    public String asString() {
        return wordStr;
    }

    public char[] asChars() { return wordStr.toLowerCase().toCharArray(); }

    public double getBaseScore() {
        return baseScore;
    }

    public String getUniqueLetters() {
        return uniqueLetters;
    }

    public double getAdjustedScore() {
        return adjustedScore;
    }

    public void setAdjustedScore(double adjustedScore) {
        this.adjustedScore = adjustedScore;
    }

    public int getLength() {
        return length;
    }

    public char getFirstLetter() { return firstLetter; }

    public char getLastLetter() { return lastLetter; }
}
