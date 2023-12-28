import junit.framework.Test;
import junit.framework.TestSuite;

public class Tests {

    public static Test suite() {
        TestSuite testSuite = new TestSuite("Letterboxed Test Suite");

        testSuite.addTestSuite(DictionariesTests.class);
        return testSuite;
    }
}
