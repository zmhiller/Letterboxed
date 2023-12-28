import com.opencsv.CSVReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Dictionary {
    static final Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");

    public HashMap<String, Double> readDict(Path dict) {
        String[] line;
        HashMap<String, Double> wordMap = new HashMap<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(DICTIONARY))) {
            while ((line = csvReader.readNext()) != null) {
                wordMap.put(line[0], Double.parseDouble(line[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return wordMap;
    }
}
