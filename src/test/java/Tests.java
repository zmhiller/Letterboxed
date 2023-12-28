import junit.framework.Test;
import junit.framework.TestSuite;

public class Tests {

    public static Test suite() {
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        testSuite.addTestSuite(DictionariesTests.class);
        return testSuite;
    }

    public static void printTestOutput(String test, String expected, String actual) {
        System.out.println(test + " Test Content\nExpected: " + expected + "\nActual: " + actual);
    }
}
