import java.util.ArrayList;
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
        this.INVALID_PAIRS = Parsing.findInvalidPairs(letters);
        this.DICTIONARIES = Dictionaries.buildDictionaries(letters, this.INVALID_PAIRS);
        this.BOARD = new GameBoard(letters);
        this.SOLUTION_SET = new ArrayList<>();
    }

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
