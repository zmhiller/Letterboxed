import java.lang.reflect.Array;

public class GameBoard {

    GameBoard(char[] letters) {
        char[][] sides = defineSides(letters);
    }

    public static char[][] defineSides(char[] letters) {
        char[][] sides = new char[4][5];
        int l = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\ni = %d j = %d l = %d",i, j, l);
                sides[j][i] = letters[l];
                System.out.printf("[ %s ],[ %s ]: "+ sides[j][i],j,i);
                l++;
            }
        }
        return sides;
    }

    public static void main(String[] args) {
        char[] testletters = "abcdefghijkl".toCharArray();
        char[][] testsides = defineSides(testletters);
    }
}

