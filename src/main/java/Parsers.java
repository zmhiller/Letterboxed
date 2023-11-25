import com.opencsv.CSVReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Parsers {

    static Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");

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
