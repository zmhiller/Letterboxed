import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTests {
    static GameBoard testBoard;

    static {
        try {
            testBoard = new GameBoard(testMain.TEST_LETTERS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static String EXPECTED_SIDES = "[[a, b, c], [d, e, f], [g, h, i], [j, k, l]]";
    static String EXPECTED_ILLEGAL_PAIRS = "[aa, ab, ac, ba, bb, bc, ca, cb, cc, dd, de, df, ed, ee, ef, " +
            "fd, fe, ff, gg, gh, gi, hg, hh, hi, ig, ih, ii, jj, jk, jl, kj, kk, kl, lj, lk, ll]";
    static List<String[]> EXPECTED_FIRST_FIVE = new ArrayList<String[]>(Arrays.asList(new String[]{"Ada", "4", "1.386", "3"},
            new String[]{"Adad", "6", "1.792", "4"}, new String[]{"Adage", "7", "1.946", "5"},
            new String[]{"Adai, 5, 1.609, 4"}, new String[]{"Adalid, 8, 2.079, 6"}));


public static boolean sidesTest() {
        String ACTUAL_SIDES = Arrays.deepToString(testBoard.sides);
        try {
            assertEquals(EXPECTED_SIDES, ACTUAL_SIDES);
            return true;
            //System.out.print("PASS\n");
        } catch (AssertionFailedError e) {
            //System.out.print("FAIL\n");
            return false;
        }
    }

    public static boolean illegalPairsTest() {
        String ACTUAL_ILLEGAL_PAIRS = Arrays.deepToString(testBoard.illegalPairs);
        try {
            assertEquals(EXPECTED_ILLEGAL_PAIRS, ACTUAL_ILLEGAL_PAIRS);
            return true;
        } catch (AssertionFailedError e) {
            return false;
        }
    }

    public static boolean dictionaryReadTest() {
        List<String[]> ACTUAL_FIRST_FIVE = testBoard.validWords.subList(0, 5);
        for (int i = 0; i < 5; i++) {
            try {
                assertArrayEquals(EXPECTED_FIRST_FIVE.get(i), ACTUAL_FIRST_FIVE.get(i));
            } catch (Exception ignored) {
                return false;
            }
        }
        return true;
    }

    public static boolean eliminateWordsWithInvalidLettersTest(String word) {

            try {
                assertTrue(IO.hasValidLetters(word, testBoard));
                return true;
            } catch (AssertionFailedError e) {
                return false;
            }
       /*
        if (IO.hasValidLetters(word, testBoard)) {
            System.out.println("ALL LETTERS VALID");
        } else {
            System.out.println("INVALID LETTERS");
        }

        */
        }
    }
