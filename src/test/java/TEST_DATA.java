import java.util.List;

public class TEST_DATA {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final String TEST_LETTERS = "abcdefghijkl";
    static final List<String> INVALID_PAIRS = List.of("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll");
    static final String[] VALID_WORD_ENTRY = new String[]{"Adage", "1.946"};
    static final String[] INVALID_WORD_ENTRY = new String[]{"Absolutists", "2.565"};

    public static String[][] getDictAFirstFive() {

        String[][] firstFive = new String[5][4];
        firstFive[0] = new String[]{"Ada","1.386", "2", "ad"};
        firstFive[1] = new String[]{"Adad","1.792", "2", "ad"};
        firstFive[2] = new String[]{"Adage","1.946", "4", "adeg"};
        firstFive[3] = new String[]{"Adai","1.609", "3", "adi"};
        firstFive[4] = new String[]{"Adalid","2.079", "4", "adil"};

        return firstFive;
    }




}




