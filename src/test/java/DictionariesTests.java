import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionariesTests extends TestCase {

    public void testReadDicitonary() {
        String expected = Arrays.deepToString(TEST_DATA.DICT_A_FIRST_FIVE);

        List<String[]> testRead = Dictionaries.readDictionary("dictA.csv");
        String[][] lines = new String[5][];
        for (int i = 0; i < 5; i++) {
             lines[i] = testRead.get(i);
        }
        String actual = Arrays.deepToString(lines);

        assertEquals(expected, actual);
    }
}

