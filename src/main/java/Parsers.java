import com.opencsv.CSVReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Parsers {

    static Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");

    public static void parseDictionary(Path dict, GameBoard board) throws Exception {
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dict))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (validateWord(line[0], board)) {
                    board.addValidWord(new Word(line));
                }
            }
        }
    }

    public static boolean validateWord(String word, GameBoard board) {
        //Check for illegal letters
        List<Character> charList = board.getCharList();
        for (char c : word.toLowerCase().toCharArray()) {
            if (!charList.contains(c)) {
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
