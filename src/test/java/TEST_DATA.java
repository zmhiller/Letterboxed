import java.util.HashMap;
import java.util.List;

public class TEST_DATA {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final String TEST_LETTERS = "abcdefghijkl";
    static final List<String> INVALID_PAIRS = List.of("ab", "ac", "ba", "bc", "ca", "cb", "de", "df",
            "ed", "ef", "fd", "fe", "gh", "gi", "hg", "hi", "ig", "ih", "jk",
            "jl", "kj", "kl", "lj", "lk");
    static final String[] VALID_WORD_ENTRY = new String[]{"Adage", "1.946"};
    static final String[] INVALID_WORD_ENTRY = new String[]{"Absolutists", "2.565"};
    static final HashMap<String, List<Word>> DICTIONARIES = Dictionaries.buildDictionaries(TEST_LETTERS,
            INVALID_PAIRS);
    static final char[][] TEST_SIDES = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}};

}




