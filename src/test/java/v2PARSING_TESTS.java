import junit.framework.TestCase;

import java.util.Arrays;

public class v2PARSING_TESTS extends TestCase {
    static final Game testGame = v2Tests.testGame;
    public void testIllegalPairs() {
        String exp = v2TEST_ITEMS.INVALID_PAIRS;
        String act = Arrays.toString(testGame.getIllegalPairs());

        assertEquals(exp, act);
    }
}
