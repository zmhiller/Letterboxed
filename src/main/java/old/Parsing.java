import com.opencsv.CSVReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parsing {

    static final String DICTIONARIES = "src/main/resources/dictionaries/";

    static void buildDictionaries(Game game) {
        List<Character> letters = game.getCharList();
        for (char l : letters) {
            List<Word> list = new ArrayList<>();
            String newDict = DICTIONARIES + "dict" + String.valueOf(l).toUpperCase() + ".csv";
            Path dictionary = Path.of(newDict);
            try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionary))) {
                String[] line;
                csvReader.readNext();
                while ((line = csvReader.readNext()) != null) {
                    if (validateWord(line[0], game)) {
                        list.add(new Word(line));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            game.addDictionary(l, list);
        }
    }

    public static boolean validateWord(String word, Game game) {
        //Check for illegal letters
        for (char c : word.toLowerCase().toCharArray()) {
            if (!game.getCharList().contains(c)) {
                return false;
            }
        }
        //Check for illegal pairs
        for (String pair : game.getIllegalPairs()) {
            if (word.contains(pair.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    protected static void parseIllegalPairs(Game game) {
        char[][] sides = game.getSides();
        List<String> pairs = new ArrayList<>();

        int i, j, k;
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    if (!pairs.contains(pair)) {
                        pairs.add(pair.toLowerCase());
                    }
                }
            }
        }

        game.setIllegalPairs(pairs.toArray(new String[0]));
    }
}