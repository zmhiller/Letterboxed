import junit.framework.TestCase;

import java.util.HashMap;
import java.util.List;

public class GameTests extends TestCase {
    Game testGame = new Game(TEST_DATA.TEST_LETTERS);

    public void testInvalidPairs() {
        List<String> expected = TEST_DATA.INVALID_PAIRS;
        List<String> actual = testGame.getInvalidPairs();

        Tests.printTestOutput("Game - Invalid Pairs", expected.toString(), actual.toString());
        assertEquals(expected, actual);
    }

    public void testDictionaries() {
        String expected = "\"A\": 96 entries | First: 'Ajaja', Last 'Ale'";

        List<Word> dictA = testGame.getDictionaries().get("A");
        String size = String.valueOf(dictA.size());
        String first = dictA.get(0).getWord();
        String last = dictA.get(dictA.size() - 1).getWord();

       String actual = String.format("\"A\": %s entries | First: '%s', Last '%s'", size, first, last);

       Tests.printTestOutput("Game - Dictionaries", expected, actual);
        assertEquals(expected, actual);
    }


}
