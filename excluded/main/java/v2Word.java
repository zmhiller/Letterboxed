import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Word {

    public String word;
    private final Double baseScore, adjustedScore;
    private List<Character> uniqueLetters = new ArrayList<>();
    private static int length;
    private int uniqueLetterCount;

    public Word(String[] dictLine) {
        this.word = dictLine[0];
        this.baseScore = Double.parseDouble(dictLine[1]);
        this.adjustedScore = this.baseScore;
        this.uniqueLetterCount = Integer.parseInt(dictLine[2]);

        for (char c : dictLine[3].toLowerCase().toCharArray()) {
            this.uniqueLetters.add(c);
        }

        length = word.length();
    }

    static ListIterator<Word> validWordIterator = new ListIterator<Word>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Word next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public Word previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Word word) {

        }

        @Override
        public void add(Word word) {

        }
    };

    public Double getBaseScore() {
        return baseScore;
    }

    public Double getAdjustedScore() {
        return adjustedScore;
    }

    public List<Character> getUniqueLetters() {
        return uniqueLetters;
    }

    public void setUniqueLetters(List<Character> uniqueLetters) {
        this.uniqueLetters = uniqueLetters;
    }

    public int getUniqueLetterCount() {
        return uniqueLetterCount;
    }

    public void setUniqueLetterCount(int uniqueLetterCount) {
        this.uniqueLetterCount = uniqueLetterCount;
    }

    public static int length() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("[%s, %.3f, %d, %s]", this.word, this.baseScore, this.uniqueLetterCount, this.uniqueLetters);
    }
}