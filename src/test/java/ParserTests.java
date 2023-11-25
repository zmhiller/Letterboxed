import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ParserTests extends TestCase {

    static final GameBoard testBoard = new GameBoard(TEST_ITEMS.LETTERS);

    public void testDictionaryParser() throws Exception {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.findValidWords(testBoard);
        List<String> EXPECTED = TEST_ITEMS.FIRST_FIVE;
        List<String> ACTUAL = new ArrayList<>();
        for (Word word : testBoard.getValidWords().subList(0, 5)) {
            ACTUAL.add(word.toString());
        }
        assertEquals(EXPECTED, ACTUAL);
    }

    public void testWordValidation() {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();

        assertTrue(Parsers.validateWord("Adage", testBoard));
        assertFalse(Parsers.validateWord("Aggravation", testBoard));
    }

    public void testWordParser() {
        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        Parsers.findValidWords(testBoard);
        Word ACTUAL = testBoard.getValidWords().get(2);
        assertEquals(TEST_ITEMS.PARSED_WORD, ACTUAL);
    }
}