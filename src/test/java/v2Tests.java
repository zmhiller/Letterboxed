import junit.framework.Test;
import junit.framework.TestSuite;

public class v2Tests {

    public static Game testGame;

    public static Test suite() {
        testGame = new Game(v2TEST_ITEMS.LETTERS);
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");
        //testSuite.addTestSuite(v2READ_TESTS.class);
        testSuite.addTestSuite(PARSING_TESTS.class);
        //testSuite.addTestSuite(v2WORD_TESTS.class);
        //testSuite.addTestSuite(v2SOLUTION_TESTS.class);

        return testSuite;
    }
}

