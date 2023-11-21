import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Word {

    private final String wordStr;
    private final double baseScore;
    private double adjustedScore;
    private final int length;
    private int uniqueLetterCount;
    private final char firstLetter, lastLetter;
    private final List<Character> uniqueLetterList = new ArrayList<>();

    Word(String[] dictionaryLine) {
        this.wordStr = dictionaryLine[0];
        this.baseScore = this.adjustedScore = Double.parseDouble(dictionaryLine[2]);
        this.length = Integer.parseInt(dictionaryLine[3]);
        this.uniqueLetterCount = Integer.parseInt(dictionaryLine[4]);
        setUniqueLetterList(this.asChars());
        this.firstLetter = this.asChars()[0];
        this.lastLetter = this.asChars()[this.length - 1];
    }

    Word(String word, double score, int length, int unique) {
        this.wordStr = word;
        this.baseScore = this.adjustedScore = score;
        this.length = length;
        this.uniqueLetterCount = unique;
        setUniqueLetterList(this.asChars());
        this.firstLetter = this.asChars()[0];
        this.lastLetter = this.asChars()[this.length - 1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Double.compare(baseScore, word.baseScore) == 0 && Double.compare(adjustedScore, word.adjustedScore) == 0 && length == word.length && uniqueLetterCount == word.uniqueLetterCount && firstLetter == word.firstLetter && lastLetter == word.lastLetter && Objects.equals(wordStr, word.wordStr) && Objects.equals(uniqueLetterList, word.uniqueLetterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordStr, baseScore, adjustedScore, length, uniqueLetterCount, firstLetter, lastLetter, uniqueLetterList);
    }

    public String asString() { return wordStr; }

    public char[] asChars() { return wordStr.toLowerCase().toCharArray(); }

    public double getBaseScore() { return baseScore; }

    public int getUniqueLetterCount() { return uniqueLetterCount; }

    public List<Character> getUniqueLetterList() { return uniqueLetterList; }

    public double getAdjustedScore() { return adjustedScore; }

    public int getLength() { return length; }

    public char getFirstLetter() { return firstLetter; }

    public char getLastLetter() { return lastLetter; }

    public void setUniqueLetterList(char[] chars) {
        for (char c : chars)
            if (!this.uniqueLetterList.contains(c)) {
                this.uniqueLetterList.add(c);
            }
    }

    public void setAdjustedScore(double adjustedScore) {
        this.adjustedScore = adjustedScore;
    }

}
