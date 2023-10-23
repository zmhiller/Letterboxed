import com.opencsv.CSVReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IO {

    public static List<String[]> parseDictForValidWords(Path dictionary, String[] illegalPairs) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionary))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                boolean isValid = true;
                for (String pair : illegalPairs) {
                    if (line[0].toLowerCase().contains(pair)) {
                        isValid = false;
                    }
                }
                if (isValid) {
                    list.add(line);
                }
            }
        }
        return list;
    }
}
