import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PARSING_TESTS extends TestCase {

    protected static final Game testGame = v2Tests.testGame;

    public void testIllegalPairs() {
        String expected = v2TEST_ITEMS.INVALID_PAIRS;
        String actual = Arrays.toString(testGame.getIllegalPairs());

        assertEquals(expected, actual);
    }

    public void testDictionaryMap() {
        int i = 0;
        HashMap<Character, List<Word>> act = testGame.getDictionaries();
        String expected = Arrays.toString(v2TEST_ITEMS.DICTIONARY_MAP);

        String[] actual = new String[12];
        for (Character c : act.keySet()) {
            actual[i] = String.valueOf(c);
            i++;
        }

        assertEquals(expected, Arrays.toString(actual));
    }
}
