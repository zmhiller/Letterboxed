import java.util.*;

public class Parsing {

    public static boolean noInvalidPairs(String word, List<String> invalidPairs) {
        List<String> wordPairs = getWordPairs(word);

        for (String invalidPair : invalidPairs) {
            for (String wordPair : wordPairs) {
                if (Objects.equals(wordPair, invalidPair)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean noInvalidLetters(String word, String validLetters) {
        String invalidLetters = getInvalidLetters(validLetters);

        for (char c : validLetters.toCharArray()) {
            invalidLetters = invalidLetters.replace(String.valueOf(c), "");
        }

        char[] wordLetters = word.toLowerCase().toCharArray();
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

    public static List<String> getWordPairs(String word) {
        List<String> wordPairs = new ArrayList<>();
        char[] letters = word.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length - 1; i++) {
            String pair = String.valueOf(letters[i]) + letters[i + 1];
            wordPairs.add(pair);
        }

        return wordPairs;
    }

}
