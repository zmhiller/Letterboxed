import com.opencsv.CSVReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IO {

    public static List<String[]> parseDictionary(Path dictionary, GameBoard board) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionary))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (validateWord(line[0], board)) {
                    list.add(line);
                }
            }
        }
        return list;
    }

    public static boolean validateWord(String word, GameBoard board) {
        return (hasValidLetters(word, board) && hasValidPairs(word, board));
    }

    public static boolean hasValidLetters(String word, GameBoard board) {
        char[] lettersArray = board.letters.toLowerCase().toCharArray();
        char[] wordArray = word.toLowerCase().toCharArray();
        int i, j;
        for (i = 0; i < wordArray.length; i++) {
            for (j = 0; j < lettersArray.length; j++) {
                if (wordArray[i] == lettersArray[j]) {
                    break;
                }
            } if (j == lettersArray.length) {
                return  false;
            }
        }
        return true;
    }

    public static boolean hasValidPairs(String word, GameBoard board) {
        for (String pair : board.illegalPairs) {
            if (word.toLowerCase().contains(pair)) {
                return false;
            }
        }
        return true;
    }
}
