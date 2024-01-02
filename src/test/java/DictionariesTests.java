import junit.framework.TestCase;

import java.util.*;

public class DictionariesTests extends TestCase {

    static final HashMap<String, List<Word>> DICTIONARIES = Dictionaries.buildDictionaries(TEST_DATA.TEST_LETTERS,
            TEST_DATA.INVALID_PAIRS);

    public static String getDictionaryContent(String letter) {
        List<Word> dict = DICTIONARIES.get(letter);
        String first = dict.get(0).getWord();
        String last = dict.get(dict.size() - 1).getWord();
        String size = String.valueOf(dict.size());

        return String.format("\"%s\": %s entries | First: '%s', Last '%s'", letter, size, first, last);
    }

    public void testDictionariesList() {
        String expected = Arrays.toString(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"});
        String actual = Arrays.toString(DICTIONARIES.keySet().toArray(new String[0]));

        Tests.printTestOutput("Dictionary List", expected, actual);
        assertEquals(expected, actual);
    }

    public void testDictionaryAUnsorted() {
        String expected = "\"A\": 96 entries | First: 'Ada', Last 'Alike'";
        List<Word> dictA = DICTIONARIES.get("A");
        String size = String.valueOf(dictA.size());
        String first = dictA.get(0).getWord();
        String last = dictA.get(dictA.size() - 1).getWord();

       String actual = String.format("\"A\": %s entries | First: '%s', Last '%s'", size, first, last);

        Tests.printTestOutput("Dictionary A Size", expected, actual);
        assertEquals(expected, actual);
    }

    public void testDictionaryASorted() {
        String expected = "\"A\": 96 entries | First: 'Ajaja', Last 'Ale'";
        List<Word> dictA = DICTIONARIES.get("A");
        Parsing.sortDictionary(dictA);
        String size = String.valueOf(dictA.size());
        String first = dictA.get(0).getWord();
        String last = dictA.get(dictA.size() - 1).getWord();

       String actual = String.format("\"A\": %s entries | First: '%s', Last '%s'", size, first, last);

        Tests.printTestOutput("Dictionary A Size", expected, actual);
        assertEquals(expected, actual);
    }
}

