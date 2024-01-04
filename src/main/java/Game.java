import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {

    private final String VALID_LETTERS;
    private final List<String> INVALID_PAIRS;
    private final List<Solution> SOLUTION_SET;
    private HashMap<String, List<Word>> DICTIONARIES;
    // private Gameboard board;  <- Coming Soon (TM)



    public Game(String letters) {
        this.VALID_LETTERS = letters;
        this.INVALID_PAIRS = Parsing.findInvalidPairs(this.VALID_LETTERS);
        this.DICTIONARIES = Dictionaries.buildDictionaries(VALID_LETTERS, INVALID_PAIRS);
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
}
