import java.util.Arrays;
import java.util.HashMap;

public class testMain {
    static String TEST_LETTERS = "abcdefghijkl";
    public static GameBoard testBoard = new GameBoard(TEST_LETTERS);
    static HashMap<String, String> testWord = new HashMap<>();

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

    private static void printTestHeader(char[] letters) {
        System.out.printf("\nInput String: \t%s\n", Arrays.toString(letters).toUpperCase());
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) throws Exception {

        testBoard.defineSides();
        testBoard.defineIllegalPairs();
        testBoard.genValidWordsList();

        testWord.put("Word", "Adage");
        testWord.put("Base", "1.946");
        testWord.put("Length", "5");
        testWord.put("Unique", "Adge");
        testWord.put("First", "A");
        testWord.put("Last", "E");

        printTestHeader(TEST_LETTERS.toCharArray());
        printTestResult(GameBoardTests.sidesTest(), "Sides Test");
        printTestResult(GameBoardTests.illegalPairsTest(), "Illegal Pairs Test");
        printTestResult(GameBoardTests.dictionaryReadTest(), "Dictionary Read Test");
        printTestResult(GameBoardTests.eliminateWordsWithInvalidLettersTest("adage", "riposte"), "Valid Words Test");

        printTestResult(WordTests.wordParsingTest(testBoard), "Word Parsing Test");
    }
}




