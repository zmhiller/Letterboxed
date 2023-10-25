import com.opencsv.CSVReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IO {

    public static List<String[]> parseDictForValidWords(Path dictionary, GameBoard board) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionary))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (checkForIllegalPairs(line[0], board.illegalPairs) && (checkForValidLetters(line[0], board.letters))) {
                    list.add(line);
                }
            }
        }
        return list;
    }

    public static boolean checkForValidLetters(String word, String letters) {
        char[] lettersArray = letters.toLowerCase().toCharArray();
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

    public static boolean checkForIllegalPairs(String word, String[] illegalPairs) {
        for (String pair : illegalPairs) {
            if (word.toLowerCase().contains(pair)) {
                return false;
            }
        }
        return true;
    }
}
