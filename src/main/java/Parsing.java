import java.util.List;
import java.util.Objects;

public class Parsing {

    public static boolean noInvalidPairs(Word word, List<String> invalidPairs) {
        List<String> wordPairs = word.getWordPairs();

        //for (int i = 0; i < 24; i ++) {
        for (String invalidPair : invalidPairs) {
            for (String wordPair : wordPairs) {
                if (Objects.equals(wordPair, invalidPair)) {
                    return false;
                }
            }

        }
        return true;
    }

    public  static boolean noInvalidLetters(Word word, String validLetters) {
        String invalidLetters = "abcdefghijklmnopqrstuvwxyz";

        for (char c : validLetters.toCharArray()) {
            invalidLetters = invalidLetters.replace(String.valueOf(c), "");
        }

        char[] wordLetters = word.getLetters();
        for (char wordLetter : wordLetters) {
            for (char invalidLetter : invalidLetters.toCharArray()) {
                if (Objects.equals(wordLetter, invalidLetter)) {
                    return false;
                }
        }
        }

        return true;
    }

    public static String getInvalidLetters(String validLetters) {
        String invalidLetters = "abcdefghijklmnopqrstuvwxyz";

        for (char c : validLetters.toCharArray()) {
            invalidLetters = invalidLetters.replace(String.valueOf(c), "");
        }

        return invalidLetters;
    }

}
