import com.opencsv.CSVReader;

import javax.print.attribute.standard.Sides;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {


    private String letters;
    private char[][] sides;
    private String[] illegalPairs;
    private List<String[]> validWords;

    GameBoard(String letters) throws Exception {
        this.letters = letters;
    }

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    protected void defineSides() {
        char[] letterArray = this.letters.toCharArray();
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
        List<String[]> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(IO.DICTIONARY))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (IO.validateWord(line[0], this)) {
                    list.add(line);
                }
            }
        }
        this.setValidWords(list);
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
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

    public List<String[]> getValidWords() {
        return validWords;
    }

    public void setValidWords(List<String[]> validWords) {
        this.validWords = validWords;
    }

    public static void main(String[] args) {
    }
}

