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



    public static List<String> findInvalidPairs(String letters) {
        List<String> invalidPairs = new ArrayList<>();
        char[][] sides = getSides(letters);
        int i, j, k;
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (side[j] != side[k]) {
                        String pair = String.valueOf(side[j]) + side[k];
                        if (!invalidPairs.contains(pair)) {
                            invalidPairs.add(pair);
                        }
                    }
                }
            }
        }

        return invalidPairs;
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

    public static void main(String[] args) {
        System.out.println(findInvalidPairs("abcdefghijkl"));
    }
}
