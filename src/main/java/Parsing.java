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


}
