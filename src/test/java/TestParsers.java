import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class TestParsers extends TestCase {

    static GameBoard testBoard = AllTests.testBoard;

    public void testDictionaryParser() throws Exception {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.parseDictionary(TEST_ITEMS.DICTIONARY, testBoard);
        List<String> EXPECTED = TEST_ITEMS.FIRST_FIVE;
        List<String> ACTUAL = new ArrayList<>();
        for (Word word : testBoard.getValidWords().subList(0, 5)) {
            ACTUAL.add(word.asString());
        }
        assertEquals(EXPECTED, ACTUAL);
    }

    public void testWordValidation() {
        assertTrue(Parsers.validateWord("Adage", testBoard));
        assertFalse(Parsers.validateWord("Aggravation", testBoard));
    }

    public void testWordParser() {
        Word ACTUAL = testBoard.getValidWords().get(2);
        assertEquals(TEST_ITEMS.PARSED_WORD, ACTUAL);
        assertEquals(TEST_ITEMS.WORD_STR, ACTUAL.asString());
        assertEquals(TEST_ITEMS.WORD_SCORE, ACTUAL.getAdjustedScore());
        assertEquals(TEST_ITEMS.WORD_UNIQUE_LIST, ACTUAL.getUniqueLetterList());
    }

    public void testValidWordEntry() {
       assertTrue(testBoard.getValidWords().contains(TEST_ITEMS.PARSED_WORD));
    }

    public void testValidWordIndex() {
        int EXPECTED = 2;
        int ACTUAL = testBoard.getValidWords().indexOf(TEST_ITEMS.PARSED_WORD);
        assertEquals(EXPECTED, ACTUAL);
    }
}