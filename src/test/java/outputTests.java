import java.util.Arrays;

public class outputTests {

        static String TEST_LETTERS = "abcdefghijkl";
        static char[][] TEST_SIDES = GameBoard.defineSides(TEST_LETTERS.toCharArray());
        static String[] ILLEGAL_PAIRS = GameBoard.defineIllegalPairs(TEST_SIDES);

    public static void main(String[] args) {
        GameBoard testBoard = new GameBoard(TEST_LETTERS);
        testBoard.defineSides();
        testBoard.printSides();
        //GameBoard.defineSides(testBoard.letterArray);
        //GameBoard.printSides(TEST_SIDES);
        String illegalPairs = Arrays.toString(ILLEGAL_PAIRS);
        int numPairs = ILLEGAL_PAIRS.length;
        System.out.printf("\nIllegal Pairs:\n %s | Total: (%d)", illegalPairs, numPairs);
    }
}
