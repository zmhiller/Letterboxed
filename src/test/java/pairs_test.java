import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairs_test {

    static char[] side1 = new char[]{'a','b','c'};
    static char[] side2 = new char[]{'d','e','f'};
    static char[] side3 = new char[]{'g','h','i'};
    static char[] side4 = new char[]{'j','k','l'};
    static char[][] sides = new char[][]{side1, side2, side3, side4};

    static String[] findIllegalPairs(char[][] sides) {
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
        String[] pairs = findIllegalPairs(sides);
        //System.out.println(Arrays.toString(pairs));

    }
}


