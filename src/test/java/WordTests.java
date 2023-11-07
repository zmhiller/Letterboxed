import static org.junit.jupiter.api.Assertions.*;
import org.opentest4j.AssertionFailedError;
import java.util.Objects;

public class WordTests {
    //static Word testWord = new Word("adage", 1.946, 5);
    static String EXPECTED_WORD_STRING = "Adage", EXPECTED_UNIQUE_LETTERS;
    static char EXPECTED_FIRST;
    static char EXPECTED_LAST;
    static double EXPECTED_BASE_SCORE = 1.946;
    static int EXPECTED_LENGTH = 5;

    public Word findValidWordEntry(String searchWord, GameBoard board) {
        for (Word w : board.getValidWords()) {
            if (Objects.equals(w.asString(), searchWord)) {
                return w;
            }
        }
        return null;
    }

    public static boolean wordParsingTest(GameBoard board) {
        Word ACTUAL_WORD = board.getValidWords()
        String ACTUAL_WORD_STRING = parsedWord.asString(), ACTUAL_UNIQUE_LETTERS = parsedWord.getUniqueLetters();
        Double ACTUAL_BASE_SCORE = parsedWord.getBaseScore();
        int ACTUAL_LENGTH = parsedWord.getLength();
        char ACTUAL_FIRST = parsedWord.getFirstLetter(), ACTUAL_LAST = parsedWord.getLastLetter();

        try {
            assertEquals(EXPECTED_WORD_STRING, ACTUAL_WORD_STRING);
            assertEquals(EXPECTED_BASE_SCORE, ACTUAL_BASE_SCORE);
            assertEquals(EXPECTED_UNIQUE_LETTERS, ACTUAL_UNIQUE_LETTERS);
            assertEquals(EXPECTED_LENGTH, ACTUAL_LENGTH);
            assertEquals(EXPECTED_FIRST, ACTUAL_FIRST);
            assertEquals(EXPECTED_LAST, ACTUAL_LAST);

            return true;
        } catch (AssertionFailedError e) {
            return false;
        }
    }
}
