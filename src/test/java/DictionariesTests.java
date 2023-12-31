import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DictionariesTests extends TestCase {

    public void testReadDictionary() {
        String expected = Arrays.deepToString(TEST_DATA.DICT_A_FIRST_FIVE);

        List<String[]> testRead = Dictionaries.readDictionary("dictA.csv", TEST_DATA.TEST_LETTERS, TEST_DATA.INVALID_PAIRS);
        String[][] lines = new String[5][];
        for (int i = 0; i < 5; i++) {
             lines[i] = testRead.get(i);
        }
        String actual = Arrays.deepToString(lines);

        Tests.printTestOutput("Full Dictionary Read", expected, actual);
        assertEquals(expected, actual);
    }

    public void testDictionariesList() {
        String expected = Arrays.toString(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"});
        String actual = Arrays.toString(Dictionaries.buildDictionaries(TEST_DATA.TEST_LETTERS, TEST_DATA.TEST_LETTERS, TEST_DATA.INVALID_PAIRS).keySet().toArray(new String[0]));

        Tests.printTestOutput("Dictionary List", expected, actual);
        assertEquals(expected, actual);
    }

    public void testDictionariesContent() {
        String expected = Arrays.deepToString(TEST_DATA.DICT_A_FIRST_FIVE);

        HashMap<String, List<String[]>> output = Dictionaries.buildDictionaries(TEST_DATA.TEST_LETTERS, TEST_DATA.TEST_LETTERS, TEST_DATA.INVALID_PAIRS);
        List<String[]> testRead = output.get("A");
        String[][] lines = new String[5][];
        for (int i = 0; i < 5; i++) {
            lines[i] = testRead.get(i);
        }
        String actual = Arrays.deepToString(lines);

        Tests.printTestOutput("Dictionary List Read (First Five)", expected, actual);
        assertEquals(expected, actual);
    }
}

