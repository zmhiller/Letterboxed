import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {

    public GameBoard(String letters) {
        char [] letterArray = letters.toCharArray();
        char[][] sides = defineSides(letterArray);
        String[] illegalPairs = defineIllegalPairs(sides);
    }

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    public static char[][] defineSides(String letters) {
        char[][] sides = new char[4][3];
        int l = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sides[i][j] = letters[l];
                l++;
            }
        }
        return sides;
    }

    protected static void printSides(char[][] sides) {
        System.out.println("                    Sides\n    TOP        RGT        BOT        LFT");
        System.out.println(Arrays.deepToString(sides));
    }

    protected static String[] defineIllegalPairs(char[][] sides) {
        int i, j, k;
        List<String> pairsList = new ArrayList<>();
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    if (!pairsList.contains(pair)) {
                        pairsList.add(pair);
                    }
                }
            }
        }
        return pairsList.toArray(new String[0]);
    }

    public static void main(String[] args) {

    }
}

