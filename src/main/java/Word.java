import java.util.ArrayList;
import java.util.List;

public class Word {
    private final String word;
    private final char[] letters;
    private final int length, uniqueLetterCount;
    private final double baseScore;
    private double adjustedScore;
    private final List<String> uniqueLetters = new ArrayList<>();

    public Word(String[] dictionaryEntry) {
        this.word = dictionaryEntry[0];
        this.letters = this.word.toLowerCase().toCharArray();
        this.length = this.word.length();
        this.baseScore = Double.parseDouble(dictionaryEntry[1]);
        this.adjustedScore = this.baseScore;
        listUniqueLetters();
        this.uniqueLetterCount = this.uniqueLetters.size();
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

    public String getWord() {
        return word;
    }

    public char[] getLetters() {
        return letters;
    }

    public int length() {
        return length;
    }

    public String toString() {
        //String letters = this.uniqueLetters.toString();
        return String.format("\n'%s'\n\tBase Score: %.3f\n\tAdj. Score: %.3f\n\tUnique Letters (%d): %s",
                this.word, this.baseScore, this.adjustedScore, this.uniqueLetterCount, this.uniqueLetters);
    }
}
