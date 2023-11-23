import junit.framework.Test;
import junit.framework.TestSuite;
import java.nio.file.Path;

public class AllTests {

    static final String LETTERS = TEST_ITEMS.LETTERS;
    static final Path DICTIONARY = TEST_ITEMS.DICTIONARY;
    public static final GameBoard testBoard = new GameBoard(LETTERS);

    public static Test suite() throws Exception {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.parseDictionary(DICTIONARY, testBoard);
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        //$JUnit-BEGIN$
        testSuite.addTestSuite(GameBoardTests.class);
        testSuite.addTestSuite(ParserTests.class);
        //$JUnit-END$

        return testSuite;
    }
}

