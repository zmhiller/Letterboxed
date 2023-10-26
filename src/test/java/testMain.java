import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMain {
    static String TEST_LETTERS = "abcdefghijkl";

    public static void printTestResult(boolean result, String testName) {
        int lineLength = 46;
        int gap = lineLength - testName.length();
        String padding = String.format("%1$" + gap + "s", "").replace(' ', '.');
        System.out.print(testName + padding);
        if (result) {
            System.out.print("PASS\n");
        } else {
            System.out.print("FAIL\n");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.printf("\nInput String: \t%s\n", TEST_LETTERS);
        System.out.println("--------------------------------------------------");

        //GameBoardTests.sidesTest();
        printTestResult(GameBoardTests.sidesTest(), "Sides Test");
        printTestResult(GameBoardTests.illegalPairsTest(), "Illegal Pairs Test");
        printTestResult(GameBoardTests.dictionaryReadTest(), "Dictionary Read Test");
        printTestResult(GameBoardTests.eliminateWordsWithInvalidLettersTest("adage"), "Valid Words Test");
    }
}




