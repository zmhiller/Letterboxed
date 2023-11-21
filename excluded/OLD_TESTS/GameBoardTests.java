import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTests {

    static GameBoard testBoard = testMain.testBoard;
    static String EXPECTED_SIDES = "[[a, b, c], [d, e, f], [g, h, i], [j, k, l]]";
    static String EXPECTED_ILLEGAL_PAIRS = "[aa, ab, ac, ba, bb, bc, ca, cb, cc, dd, de, df, ed, ee, ef, " +
            "fd, fe, ff, gg, gh, gi, hg, hh, hi, ig, ih, ii, jj, jk, jl, kj, kk, kl, lj, lk, ll]";
    static List<String[]> EXPECTED_FIRST_FIVE = new ArrayList<>(Arrays.asList(new String[]{"Ada", "4", "1.386", "3"},
            new String[]{"Adad", "6", "1.792", "4"}, new String[]{"Adage", "7", "1.946", "5"},
            new String[]{"Adai", "5", "1.609", "4"}, new String[]{"Adalid", "8", "2.079", "6"}));


public static boolean sidesTest() {
        String ACTUAL_SIDES = Arrays.deepToString(testBoard.getSides());
        try {
            assertEquals(EXPECTED_SIDES, ACTUAL_SIDES);
            return true;
        } catch (AssertionFailedError e) {
            return false;
        }
    }

    public static boolean illegalPairsTest() {
        String ACTUAL_ILLEGAL_PAIRS = Arrays.deepToString(testBoard.getIllegalPairs());
        try {
            assertEquals(EXPECTED_ILLEGAL_PAIRS, ACTUAL_ILLEGAL_PAIRS);
            return true;
        } catch (AssertionFailedError e) {
            return false;
        }
    }

    public static boolean dictionaryReadTest() {
        List<Word> ACTUAL_FIRST_FIVE = testBoard.getValidWords().subList(0, 5);
        for (int i = 0; i < 5; i++) {
            try {
                String EXPECTED = EXPECTED_FIRST_FIVE.get(i)[0];
                String ACTUAL = ACTUAL_FIRST_FIVE.get(i).asString();
                assertEquals(EXPECTED, ACTUAL);
            } catch (AssertionFailedError e) {
                return false;
            }
        }
        return true;
    }

    public static boolean eliminateWordsWithInvalidLettersTest(String goodWord, String badWord) {

            try {
                assertTrue(IO.hasValidLetters(goodWord, testBoard));
                assertFalse(IO.hasValidLetters(badWord, testBoard));
                return true;
            } catch (AssertionFailedError e) {
                return false;
            }
        }
    }
