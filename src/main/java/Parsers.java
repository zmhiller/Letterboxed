import com.opencsv.CSVReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Parsers {

    static final Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");
    static final Path DICTIONARIES = Path.of("src/main/resources/dictionaries/");

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    protected static char[][] parseSides(GameBoard board) {
        char[][] sides = new char[4][3];
        int l = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sides[i][j] = board.getCharList().get(l);
                l++;
            }
        }
        return sides;
    }

    protected static String[] parseIllegalPairs(GameBoard board) {
        int i, j, k;
        List<String> pairsList = new ArrayList<>();
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(board.getSides()[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    if (!pairsList.contains(pair)) {
                        pairsList.add(pair.toLowerCase());
                    }
                }
            }
        }
        return pairsList.toArray(new String[0]);
    }

    public static void findValidWords(GameBoard board) {
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(DICTIONARY))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (validateWord(line[0], board)) {
                    board.addValidWord(new Word(line));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validateWord(String word, GameBoard board) {
        //Check for illegal letters
        for (char c : word.toLowerCase().toCharArray()) {
            if (!board.getCharList().contains(c)) {
                return false;
            }
        }
        //Check for illegal pairs
        for (String pair : board.getIllegalPairs()) {
            if (word.contains(pair.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
