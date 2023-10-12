import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMain {
    static String TEST_LETTERS = "abcdefghijkl";

    public static void printTestResult(String testName) {
        int lineLength = 46;
        int gap = lineLength - testName.length();
        String padding = String.format("%1$" + gap + "s", "").replace(' ', '.');
        String resultLine = testName + padding;
        System.out.print(resultLine);
    }

    public static void main(String[] args) {
        System.out.printf("\nInput String: \t%s\n", TEST_LETTERS);
        System.out.println("--------------------------------------------------");

        GameBoardTests.sidesTest();
        GameBoardTests.illegalPairsTest();
    }
}




