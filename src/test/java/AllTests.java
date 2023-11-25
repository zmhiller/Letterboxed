import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
    public static GameBoard testBoard;

    public static Test suite() throws Exception {
        testBoard = new GameBoard(TEST_ITEMS.LETTERS);
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.findValidWords(testBoard);
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        testSuite.addTestSuite(GameBoardTests.class);
        testSuite.addTestSuite(ParserTests.class);

        return testSuite;
    }
}

