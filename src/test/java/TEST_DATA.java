import java.util.List;

public class TEST_DATA {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final String TEST_LETTERS = "abcdefghijkl";
    static final List<String> INVALID_PAIRS = List.of("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll");
    static final String[][] DICT_A_FIRST_FIVE = getDictAFirstFive();
    static final String[] VALID_WORD_ENTRY = new String[]{"Adage", "1.946"};
    static final String[] INVALID_WORD_ENTRY = new String[]{"Absolutists", "2.565"};

    public static String[][] getDictAFirstFive() {
        String[][] firstFive = new String[5][4];
        firstFive[0] = new String[]{"Aba","1.609","2","ab"};
        firstFive[1] = new String[]{"Ababdeh","2.708","5","abdeh"};
        firstFive[2] = new String[]{"Ababua","2.303","3","abu"};
        firstFive[3] = new String[]{"Abac","2.079","3","abc"};
        firstFive[4] = new String[]{"Abaca","2.197","3","abc"};

        return firstFive;
    }

    public static String getInvalidLetters() {
        char[] invalidLetterArr = new char[14];

        int i = 0;
        for (char letter : ALPHABET.toCharArray()) {
            for (char validLetter : TEST_LETTERS.toCharArray()) {
                if (letter == validLetter) {
                    break;
                } else {
                    invalidLetterArr[i] = letter;
                }
            }
        }

        return String.valueOf(invalidLetterArr);
    }
}




