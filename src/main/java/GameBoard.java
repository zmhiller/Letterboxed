import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {

    GameBoard(char[] letters) {
        char[][] sides = defineSides(letters);
    }

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    public static char[][] defineSides(char[] letters) {
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

    private static void printSides(char[][] sides) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\n[ %s ],[ %s ]: "+ sides[i][j],i,j);
            }
        }
    }

    private static String[] defineIllegalPairs(char[][] sides) {
        int i, j, k;
        List<String> pairsList = new ArrayList<>();
        for (i = 0; i < 4; i++) {
            System.out.println("Side:");
            char[] side = Arrays.copyOf(sides[i], 3);
            System.out.println(Arrays.toString(side) + "\nPairs:");
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    System.out.println(pair);
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

