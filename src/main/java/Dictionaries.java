import com.opencsv.CSVReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionaries {

    static final String DICTIONARIES = "src/main/resources/dictionaries/";

    public static List<String[]> readDictionary(String csv) {
        Path dictionaryCSV = Path.of(DICTIONARIES + csv);
        List<String[]> dictionary = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionaryCSV))) {
            String[] line;
            csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                dictionary.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dictionary;
    }
}
