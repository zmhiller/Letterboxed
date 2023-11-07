import com.opencsv.CSVReader;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {

    private final String letterString;
    private final char[] letterArray;
    private char[][] sides;
    private String[] illegalPairs;
    private List<Word> validWords;

    GameBoard(char[] letters) {
        this.letterString = new String(letters);
        this.letterArray = letters;
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
        this.setSides(sides);
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
                        pairsList.add(pair);
                    }
                }
            }
        }
        this.setIllegalPairs(pairsList.toArray(new String[0]));
    }

    public void genValidWordsList() throws Exception {
        List<Word> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(IO.TEST_DICTIONARY))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (IO.validateWord(line[0], this)) {
                    list.add(new Word(line));
                }
            }
        }
        this.setValidWords(list);
    }

    public char[] getLetterArray() {
        return letterArray;
    }

    public String getLetterString() {
        return letterString;
    }

    public char[][] getSides() {
        return sides;
    }

    public void setSides(char[][] sides) {
        this.sides = sides;
    }

    public String[] getIllegalPairs() {
        return illegalPairs;
    }

    public void setIllegalPairs(String[] illegalPairs) {
        this.illegalPairs = illegalPairs;
    }

    public List<Word> getValidWords() {
        return validWords;
    }

    public void setValidWords(List<Word> validWords) {
        this.validWords = validWords;
    }

    public static void main(String[] args) {
    }
}

