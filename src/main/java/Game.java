import java.util.List;

public class Game {

    private final String validLetters;
    private List<String> invalidPairs;
    private List<Solution> solutionSet;
    // private Gameboard board;  <- Coming Soon (TM)


    public Game(String letters) {
        this.validLetters = letters;

    }
}
