import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class ParsingTests extends TestCase {

    public void testForInvalidPairs() {
        Word VALID_WORD = new Word(TEST_DATA.VALID_WORD_ENTRY);
        Word INVALID_WORD = new Word(TEST_DATA.INVALID_WORD_ENTRY);

        Tests.printTestOutput("Invalid Pairs (Valid Word)", "true", String.valueOf(Parsing.noInvalidPairs(VALID_WORD, TEST_DATA.INVALID_PAIRS)));
        System.out.println();
        Tests.printTestOutput("Invalid Pairs (Invalid Word)", "false", String.valueOf(Parsing.noInvalidPairs(INVALID_WORD, TEST_DATA.INVALID_PAIRS)));

        assertTrue(Parsing.noInvalidPairs(VALID_WORD, TEST_DATA.INVALID_PAIRS));
        assertFalse(Parsing.noInvalidPairs(INVALID_WORD, TEST_DATA.INVALID_PAIRS));
    }

    public void testForInvalidLetters() {
        Word VALID_WORD = new Word(TEST_DATA.VALID_WORD_ENTRY);
        Word INVALID_WORD = new Word(TEST_DATA.INVALID_WORD_ENTRY);

        Tests.printTestOutput("Invalid Letters (Valid Word)", "true", String.valueOf(Parsing.noInvalidLetters(VALID_WORD, TEST_DATA.TEST_LETTERS)));
        System.out.println();
        Tests.printTestOutput("Invalid Letters (Invalid Word)", "false", String.valueOf(Parsing.noInvalidLetters(INVALID_WORD, TEST_DATA.TEST_LETTERS)));

        assertTrue(Parsing.noInvalidLetters(VALID_WORD, TEST_DATA.TEST_LETTERS));
        assertFalse(Parsing.noInvalidLetters(INVALID_WORD, TEST_DATA.TEST_LETTERS));

    }
}
