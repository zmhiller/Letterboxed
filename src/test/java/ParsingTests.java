import junit.framework.Assert;
import junit.framework.TestCase;

public class ParsingTests extends TestCase {

    public void testForIllegalPairs() {
        Word VALID_WORD = new Word(TEST_DATA.VALID_WORD_ENTRY);
        Word INVALID_WORD = new Word(TEST_DATA.INVALID_WORD_ENTRY);

        Tests.printTestOutput("Illegal Pairs Test (Valid Word)", "true", String.valueOf(Parsing.noInvalidPairs(VALID_WORD, TEST_DATA.INVALID_PAIRS)));
        System.out.println();
        Tests.printTestOutput("Illegal Pairs Test (Invalid Word)", "false", String.valueOf(Parsing.noInvalidPairs(INVALID_WORD, TEST_DATA.INVALID_PAIRS)));

        assertTrue(Parsing.noInvalidPairs(VALID_WORD, TEST_DATA.INVALID_PAIRS));
        assertFalse(Parsing.noInvalidPairs(INVALID_WORD, TEST_DATA.INVALID_PAIRS));
    }

    
}
