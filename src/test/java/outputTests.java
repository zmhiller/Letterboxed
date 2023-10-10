import java.util.Arrays;

public class outputTests {

    public static void printSides(GameBoard board) {
        System.out.println("                    Sides\n    TOP        RGT        BOT        LFT");
        System.out.println(Arrays.deepToString(board.sides));
    }

    public static void printIllegalPairs(GameBoard board) {
        String pairs = Arrays.toString(board.illegalPairs);
        int numPairs = board.illegalPairs.length;
        System.out.printf("\nIllegal Pairs:\n %s | Total: (%d)", pairs, numPairs);
    }

    public static void main(String[] args) {
    }
}
