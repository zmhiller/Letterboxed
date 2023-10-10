package test;
import


public class outputTests {
    public static void main(String[] args) {
        char[] testLetters = "abcdefghijkl".toCharArray();
        char[][] testSides = defineSides(testLetters);
        String[] illegalPairs = defineIllegalPairs(testSides);
        //printSides(testsides);
        System.out.printf("Pairs: %d\n", illegalPairs.length);
        System.out.println(Arrays.toString(illegalPairs));
    }
}
