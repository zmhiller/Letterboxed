import junit.framework.Test;
import junit.framework.TestSuite;

public class Tests {

    public static Test suite() {
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");
        
        testSuite.addTestSuite(ParsingTests.class);
        testSuite.addTestSuite(WordTests.class);
        testSuite.addTestSuite(GameTests.class);
        testSuite.addTestSuite(GameBoardTests.class);
        return testSuite;
    }

    public static void printTestOutput(String test, String expected, String actual) {
        System.out.println(test + " Test\nExpected: " + expected + "\nActual: " + actual);
    }
}
