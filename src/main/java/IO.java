import com.opencsv.CSVReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IO {

    static Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");
    static Path TEST_DICTIONARY = Path.of("src/main/resources/dictionary-test.csv");

    public static boolean validateWord(String word, GameBoard board) {
        return (hasValidLetters(word, board) && hasValidPairs(word, board));
    }

    public static boolean hasValidLetters(String word, GameBoard board) {
        char[] wordArray = word.toLowerCase().toCharArray();
        List<Character> boardList = new ArrayList<>(), wordList = new ArrayList<>();
        for (char c : board.getLetterArray()) {
            boardList.add(c);
        }
        for (char c : wordArray) {
            wordList.add(c);
        }
        for (char wordChar : wordList) {
            if (!boardList.contains(wordChar)) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasValidPairs(String word, GameBoard board) {
        for (String pair : board.getIllegalPairs()) {
            if (word.toLowerCase().contains(pair)) {
                return false;
            }
        }
        return true;
    }
}
