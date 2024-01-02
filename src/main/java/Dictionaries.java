import com.opencsv.CSVReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionaries {

    static final String DICTIONARIES = "src/main/resources/dictionaries/";

    public static List<Word> readDictionary(String csv, String validLetters, List<String> invalidPairs) {
        Path dictionaryCSV = Path.of(DICTIONARIES + csv);
        List<Word> dictionary = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionaryCSV))) {
            csvReader.readNext();
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (Parsing.noInvalidLetters(line[0], validLetters) && Parsing.noInvalidPairs(line[0], invalidPairs))
                    dictionary.add(new Word(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dictionary;
    }

    public static HashMap<String, List<Word>> buildDictionaries(String validLetters, List<String> invalidPairs) {
        HashMap<String, List<Word>> dictionaries = new HashMap<>();

        for (char c : validLetters.toCharArray()) {
            String key = String.valueOf(c).toUpperCase();
            dictionaries.put(key, readDictionary(String.format("dict%s.csv", key), validLetters, invalidPairs));
        }

        return dictionaries;
    }
}
