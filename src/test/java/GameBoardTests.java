import junit.framework.TestCase;

import java.util.Arrays;

public class GameBoardTests extends TestCase {

    private final Game testGame = new Game(TEST_DATA.TEST_LETTERS);
    private final GameBoard testBoard = new GameBoard(testGame);

    public void testSides() {
        String expected = Arrays.deepToString(TEST_DATA.TEST_SIDES);
        String actual = Arrays.deepToString(testBoard.getSides());

        Tests.printTestOutput("GameBoard Sides", expected, actual);
        assertEquals(expected, actual);
    }
}
