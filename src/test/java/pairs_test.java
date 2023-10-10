import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairs_test {
    public static void main(String[] args) {
    String[] illegalPairs = new String[36];
    String[][] letters = new String[4][3];
    char[0] = ['a','b','c'];
    chsr[1] = ['d','e','f'];
    char[2] = ['g','h','i'];
    letters[3] = ['j','k','l'];
    }

    static String[] findIllegalPairs(char[][] letters) {
        int l1 = 0;
        int l2 = 1;
        int l3 = 2;
        for (int i = 0; i < 4; i++) {
            String p1 = (letters[i][l1] + letters[i][l2]);
            String p2 = (letters[i][l1]+ letters[i][l3]);
            String p3 = (letters[i][l1] + letters[i][l1]);
            String p4 = (letters[i][l2] + letters[i][l1]);
            String p5 = (letters[i][l3] + letters[i][l1]);

        }

    }
}
