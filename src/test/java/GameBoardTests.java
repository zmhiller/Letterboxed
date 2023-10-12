import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameBoardTests {
    static GameBoard testBoard = new GameBoard(testMain.TEST_LETTERS);
    static String EXPECTED_SIDES = "[[a, b, c], [d, e, f], [g, h, i], [j, k, l]]";
    static String EXPECTED_ILLEGAL_PAIRS = "[aa, ab, ac, ba, bb, bc, ca, cb, cc, dd, de, df, ed, ee, ef, " +
            "fd, fe, ff, gg, gh, gi, hg, hh, hi, ig, ih, ii, jj, jk, jl, kj, kk, kl, lj, lk, ll]";

    @Test
    public static void sidesTest() {
        String ACTUAL_SIDES = Arrays.deepToString(testBoard.sides);
        testMain.printTestResult("Sides Test");
        try {
            assertEquals(EXPECTED_SIDES, ACTUAL_SIDES);
            System.out.print("PASS\n");
        } catch (AssertionFailedError e) {
            System.out.print("FAIL\n");
        }
    }

    @Test
    public static void illegalPairsTest() {
        String ACTUAL_ILLEGAL_PAIRS = Arrays.deepToString(testBoard.illegalPairs);
        testMain.printTestResult("Illegal Pairs Test");
        try {
            assertEquals(EXPECTED_ILLEGAL_PAIRS, ACTUAL_ILLEGAL_PAIRS);
            System.out.print("PASS\n");
        } catch (AssertionFailedError e) {
            System.out.print("FAIL\n");
        }
    }
}
