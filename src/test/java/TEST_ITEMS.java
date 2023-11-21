import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class TEST_ITEMS {
    static final String LETTERS = "abcdefghijkl";
    static final Path DICTIONARY = Path.of("src/test/resources/dictionary-test.csv");
    static final String SIDES = Arrays.deepToString(new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}});
    static final String INVALID_PAIRS = Arrays.toString(new String[]{"aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"});
    static final List<String> FIRST_FIVE = Arrays.asList("Abd", "Abdal", "Abdali", "Abdiel", "Abe");
    static final Word PARSED_WORD = new Word(new String[]{"Abdali", "2.197", "6", "5"});
    static String WORD_STR = "Abdali";
    static double WORD_SCORE = 2.197;
    static int WORD_LENGTH = 6, WORD_UNIQUE_COUNT = 5;
    static List<Character> WORD_UNIQUE_LIST = Arrays.asList('a', 'b', 'd', 'l', 'i');
    static char WORD_FIRST = 'a', WORD_LAST = 'i';


}
