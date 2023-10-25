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
}
