import junit.framework.TestCase;

import java.util.Arrays;

public class TestGameBoards extends TestCase {
    static GameBoard testBoard = AllTests.testBoard;

    public void testSides() throws Exception {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.parseDictionary(TEST_ITEMS.DICTIONARY, testBoard);
        String EXPECTED = TEST_ITEMS.SIDES;
        String ACTUAL = Arrays.deepToString(testBoard.getSides());
        assertEquals(EXPECTED, ACTUAL);
    }

    public void testIllegalPairs() {
        String EXPECTED = TEST_ITEMS.INVALID_PAIRS;
        String ACTUAL = Arrays.toString(testBoard.getIllegalPairs());
        assertEquals(EXPECTED, ACTUAL);
    }
}
