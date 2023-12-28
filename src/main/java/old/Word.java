import java.util.Arrays;
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
        this.baseScore = this.adjustedScore = Double.parseDouble(dictionaryLine[2]);
        this.uniqueLetterCount = Integer.parseInt(dictionaryLine[3]);
        this.uniqueLetterList = dictionaryLine[4].toCharArray();
        this.firstLetter = word.charAt(0);
        this.lastLetter = word.charAt(word.length() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Double.compare(baseScore, word1.baseScore) == 0 && Double.compare(adjustedScore, word1.adjustedScore) == 0
                && uniqueLetterCount == word1.uniqueLetterCount && firstLetter == word1.firstLetter &&
                lastLetter == word1.lastLetter && Objects.equals(word, word1.word) &&
                Arrays.equals(uniqueLetterList, word1.uniqueLetterList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(word, baseScore, adjustedScore, uniqueLetterCount, firstLetter, lastLetter);
        result = 31 * result + Arrays.hashCode(uniqueLetterList);
        return result;
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

    public void print() {
        System.out.printf("Word: %s\nBase Score: %f\nUnique Count: %d\nUnique List: %s\n",
                this.word, this.getBaseScore(), this.getUniqueLetterCount(), Arrays.toString(this.getUniqueLetterList()));
    }

}
