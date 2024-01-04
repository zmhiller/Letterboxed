import junit.framework.TestCase;

import java.util.*;

public class DictionariesTests extends TestCase {

    static final HashMap<String, List<Word>> DICTIONARIES = Dictionaries.buildDictionaries(TEST_DATA.TEST_LETTERS,
            TEST_DATA.INVALID_PAIRS);

    public void testDictionariesList() {
        String expected = Arrays.toString(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"});
        String actual = Arrays.toString(DICTIONARIES.keySet().toArray(new String[0]));

        Tests.printTestOutput("Dictionary List", expected, actual);
        assertEquals(expected, actual);
    }

    public void testDictionariesSorted() {
        String expected = "\"A\": 96 entries | First: 'Ajaja', Last 'Ale'";
        Dictionaries.sortDictionaries(DICTIONARIES);
        List<Word> dictA = DICTIONARIES.get("A");
        String size = String.valueOf(dictA.size());
        String first = dictA.get(0).getWord();
        String last = dictA.get(dictA.size() - 1).getWord();

       String actual = String.format("\"A\": %s entries | First: '%s', Last '%s'", size, first, last);

        Tests.printTestOutput("Dictionaries (Sorted)", expected, actual);

        ////
        for (char c : TEST_DATA.TEST_LETTERS.toCharArray()) {
            List<Word> dict = DICTIONARIES.get(String.valueOf(c).toUpperCase());
            String dSize = String.valueOf(dict.size());
            String dFirst = dict.get(0).getWord();
            String dLast = dict.get(dict.size() - 1).getWord();
            System.out.printf("\n\"%s\": %s entries | First: '%s', Last '%s'", String.valueOf(c).toUpperCase(), dSize, dFirst, dLast);
        }
        ////

        assertEquals(expected, actual);
    }
}

