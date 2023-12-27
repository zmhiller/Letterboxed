import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
    public static GameBoard testBoard;

    public static Test suite() {
        testBoard = new GameBoard(v2TEST_ITEMS.LETTERS);
        Parsers.findValidWords(testBoard);
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        testSuite.addTestSuite(GameBoardTests.class);
        testSuite.addTestSuite(ParserTests.class);

        return testSuite;
    }
}

