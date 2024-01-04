import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Game {

    private final String VALID_LETTERS;
    private final List<String> INVALID_PAIRS;
    private final List<Solution> SOLUTION_SET;
    private final HashMap<String, List<Word>> DICTIONARIES;
    private final GameBoard BOARD;

    public Game(String letters) {
        this.VALID_LETTERS = letters;
        this.INVALID_PAIRS = findInvalidPairs();
        this.DICTIONARIES = Dictionaries.buildDictionaries(this);
        this.BOARD = new GameBoard(this);
        this.SOLUTION_SET = new ArrayList<>();
    }

    //// Methods

    private List<String> findInvalidPairs() {
        List<String> invalidPairs = new ArrayList<>();
        char[][] sides = GameBoard.defineSides(this.VALID_LETTERS);
        int i, j, k;
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (side[j] != side[k]) {
                        String pair = String.valueOf(side[j]) + side[k];
                        if (!invalidPairs.contains(pair)) {
                            invalidPairs.add(pair);
                        }
                    }
                }
            }
        }

        return invalidPairs;
    }

    //// Getters & Setters

    public String getValidLetters() {
        return VALID_LETTERS;
    }

    public List<String> getInvalidPairs() {
        return INVALID_PAIRS;
    }

    public List<Solution> getSolutionSet() {
        return SOLUTION_SET;
    }

    public HashMap<String, List<Word>> getDictionaries() {
        return DICTIONARIES;
    }

    public GameBoard getBoard() {
        return BOARD;
    }
}
