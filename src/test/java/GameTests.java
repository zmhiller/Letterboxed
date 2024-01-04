import junit.framework.TestCase;

import java.util.List;

public class GameTests extends TestCase {
    Game testGame = new Game(TEST_DATA.TEST_LETTERS);

    public void testInvalidPairs() {
        List<String> expected = TEST_DATA.INVALID_PAIRS;
        List<String> actual = testGame.getInvalidPairs();

        assertEquals(expected, actual);
    }
}
