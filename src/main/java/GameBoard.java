import java.util.*;

public class GameBoard {

    private final String letterString;
    private final char[] letterArray;
    List<Character> charList = new ArrayList<>();
    private char[][] sides;
    private String[] illegalPairs;
    private final List<Word> validWords = new ArrayList<>();

    GameBoard(String letters) {
        this.letterString = letters.toLowerCase();
        for (char c : this.letterString.toCharArray()) {
            this.charList.add(c);
        }
        letterArray = letterString.toCharArray();
        System.arraycopy(letters.toLowerCase().toCharArray(), 0, this.letterArray,
                0, letters.length());
    }

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    protected void defineSides() {
        char[][] sides = new char[4][3];
        int l = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sides[i][j] = letterArray[l];
                l++;
            }
        }
        this.sides = sides;
    }

    protected void defineIllegalPairs() {
        int i, j, k;
        List<String> pairsList = new ArrayList<>();
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(this.sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    if (!pairsList.contains(pair)) {
                        pairsList.add(pair.toLowerCase());
                    }
                }
            }
        }
        this.illegalPairs = pairsList.toArray(new String[0]);
    }

    public char[] toCharArray() { return letterArray; }

    public List<Character> getCharList() {
        return charList;

    }
    @Override
    public String toString() {
        return letterString;
    }

    public char[][] getSides() {
        return sides;
    }

    public String[] getIllegalPairs() {
        return illegalPairs;
    }

    public List<Word> getValidWords() {
        return validWords;
    }

    public void addValidWord(Word word) {
        this.validWords.add((word));
    }


}

