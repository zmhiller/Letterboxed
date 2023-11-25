import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    static final String LETTERS = TEST_ITEMS.LETTERS;
    public static final GameBoard testBoard = new GameBoard(LETTERS);

    public static Test suite() throws Exception {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.findValidWords(testBoard);
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        testSuite.addTestSuite(GameBoardTests.class);
        testSuite.addTestSuite(ParserTests.class);

        return testSuite;
    }
}

