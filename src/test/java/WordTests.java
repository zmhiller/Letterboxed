import junit.framework.TestCase;

public class WordTests extends TestCase {

    public void testWordConstructor() {
        Word VALID_WORD = new Word(TEST_DATA.VALID_WORD_ENTRY);

        String expected = "\n'Adage'\n\tBase Score: 1.946\n\tAdj. Score: 1.946\n\tUnique Letters (4): [a, d, g, e]";
        String actual = VALID_WORD.toString();

        Tests.printTestOutput("Word Construction", expected, actual);
        assertEquals(expected, actual);
    }
}
