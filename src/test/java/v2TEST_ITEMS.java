import java.util.Arrays;
import java.util.List;

public class v2TEST_ITEMS {
    static final String LETTERS = "abcdefghijkl";
    static final String INVALID_PAIRS = Arrays.toString(new String[]{"aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"});
    static final List<String> FIRST_FIVE = Arrays.asList("Abd", "Abdal", "Abdali", "Abdiel", "Abe");
    static final v2Word PARSED_WORD = new v2Word(new String[]{"Abdali", "2.197", "5", "abdli"});
}
