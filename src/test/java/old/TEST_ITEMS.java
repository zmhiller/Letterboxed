import java.util.Arrays;
import java.util.List;

public class TEST_ITEMS {
    static final String LETTERS = "abcdefghijkl";
    static final String SIDES = Arrays.deepToString(new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}});
    static final String INVALID_PAIRS = Arrays.toString(new String[]{"aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"});
    static final List<String> FIRST_FIVE = Arrays.asList("Abd", "Abdal", "Abdali", "Abdiel", "Abe");
    static final Word PARSED_WORD = new Word(new String[]{"Abdali", "9", "2.197", "5", "abdli"});
    //length, unique
    static final double[] TEST_WEIGHTS = new double[]{0.5, 2.0};


}
