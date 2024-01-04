import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class GameTests extends TestCase {
    Game testGame = new Game(TEST_DATA.TEST_LETTERS);

    public void testInvalidPairs() {
        List<String> expected = TEST_DATA.INVALID_PAIRS;
        List<String> actual = testGame.getInvalidPairs();

        Tests.printTestOutput("Game Invalid Pairs", expected.toString(), actual.toString());
        assertEquals(expected, actual);
    }

    public void testDictionaries() {
        String expected = "\"A\": 96 entries | First: 'Ajaja', Last 'Ale'";

        List<Word> dictA = testGame.getDictionaries().get("A");
        String size = String.valueOf(dictA.size());
        String first = dictA.get(0).getWord();
        String last = dictA.get(dictA.size() - 1).getWord();

       String actual = String.format("\"A\": %s entries | First: '%s', Last '%s'", size, first, last);

       Tests.printTestOutput("Game Dictionaries", expected, actual);

       ////
        for (char c : TEST_DATA.TEST_LETTERS.toCharArray()) {
            List<Word> dict = TEST_DATA.DICTIONARIES.get(String.valueOf(c).toUpperCase());
            String dSize = String.valueOf(dict.size());
            String dFirst = dict.get(0).getWord();
            String dLast = dict.get(dict.size() - 1).getWord();
            System.out.printf("\n\"%s\": %s entries | First: '%s', Last '%s'", String.valueOf(c).toUpperCase(), dSize, dFirst, dLast);
        }
        ////

        assertEquals(expected, actual);
    }

    public void testDictionariesList() {
        String expected = TEST_DATA.TEST_DICTIONARY_KEYS; //
        String actual = Arrays.toString(testGame.getDictionaries().keySet().toArray(new String[0]));

        Tests.printTestOutput("Game Dictionary List", expected, actual);
        assertEquals(expected, actual);
    }


}
