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

    private static void defineIllegalPairs(char[][] sides) {
        List<String> pairList = new ArrayList<String>();
        System.out.println(Arrays.deepToString(sides));
        int l1 = 0;
        int l2 = 1;
        int l3 = 2;

        for (int i = 0; i < sides.length; i++) {
            String[] sidePairs = new String[9];
            System.out.println();
            String side = Arrays.toString(sides[i]);
            System.out.println(Arrays.toString(sides[i]));
            for (int j = 0; j < 3; j++) {
                String temp = null;
            }
            for (String sidePair : sidePairs) {
                if (!pairList.contains(sidePair)) {
                    pairList.add(sidePair);
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] testletters = "abcdefghijkl".toCharArray();
        char[][] testsides = defineSides(testletters);
        //printSides(testsides);
        defineIllegalPairs(testsides);
    }
}

