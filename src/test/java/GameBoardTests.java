
import junit.framework.TestCase;
import java.util.Arrays;

public class GameBoardTests extends TestCase {
    static final GameBoard testBoard = AllTests.testBoard;

    public void testSides() {
        testBoard.defineSides();
        String EXPECTED = TEST_ITEMS.SIDES;
        String ACTUAL = Arrays.deepToString(testBoard.getSides());
        assertEquals(EXPECTED, ACTUAL);
    }

    public void testIllegalPairs() {
        testBoard.defineIllegalPairs();
        Parsers.findValidWords(testBoard);
        String EXPECTED = TEST_ITEMS.INVALID_PAIRS;
        String ACTUAL = Arrays.toString(testBoard.getIllegalPairs());
        assertEquals(EXPECTED, ACTUAL);
    }
}
