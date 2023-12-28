import com.opencsv.CSVReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class v2TEST_ITEMS {
    static final String LETTERS = "abcdefghijkl";
    static final String INVALID_PAIRS = Arrays.toString(new String[]{"aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"});
    static final List<String> FIRST_FIVE = Arrays.asList("Abd", "Abdal", "Abdali", "Abdiel", "Abe");
    static final Word PARSED_WORD = new Word(new String[]{"Abdali", "2.197", "5", "abdli"});
    static final String[] DICTIONARY_MAP = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};
    static String[] A_DICTIONARY_FIRST_10 = setTestDict("A");
    //static String[] K_DICTIONARY_FIRST_10 = setTestDict("K");


    private static String[] setTestDict(String c) {
        Path newDict = Path.of("src/main/resources/dictionaries/testDict" + c + ".csv");
        try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(newDict))) {
            csvReader.readNext();
            //List<Word> words = new ArrayList<>(10);
            String[] words = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.println(Arrays.toString(csvReader.readNext()));
                words[i] = Arrays.toString(csvReader.readNext());
            }

        return words;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
