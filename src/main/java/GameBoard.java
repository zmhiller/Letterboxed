public class GameBoard {

    GameBoard(char[] letters) {
        char[][] sides = defineSides(letters);
    }

    // i = side number (Top-0, Right-1, Bottom-2,Left-3
    //j = letter position (clockwise)
    public static char[][] defineSides(char[] letters) {
        char[][] sides = new char[4][5];
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
        String[] pairs = new String[24];
        String[] letters = new String[6];
        int j = 0;
        for (int i = 0; i < 4; i++) {
            for (int l = 0; l < 24; l++) {
                letters[l] = String.valueOf(sides[i][j] + sides[i][j += 1]); //0,1
                letters[l+=1] = String.valueOf(sides[i][j] + sides[i][j += 1]); //1,2
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        char[] testletters = "abcdefghijkl".toCharArray();
        char[][] testsides = defineSides(testletters);
        printSides(testsides);
    }
}

