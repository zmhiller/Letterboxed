public class testMain {

    static String TEST_LETTERS = "abcdefghijkl";

    public static void main(String[] args) {

        GameBoard testBoard = new GameBoard(TEST_LETTERS);
        System.out.printf("\nInput String: \t%s\n----------------------------------------------\n", TEST_LETTERS);

        outputTests.printSides(testBoard);
        outputTests.printIllegalPairs(testBoard);
    }
}
