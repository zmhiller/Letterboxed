import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Game {

    // Game variables & constants
    protected final List<Character> charList = new ArrayList<>();
    private String[] illegalPairs;
    private HashMap<Character, List<Word>> dictionaries = new HashMap<>(12);
    private String[][] solutions;
    private char[][] sides = new char[4][3];
    private char[] chars;

    // New game constructor; takes input string of letters & finds list of valid v2Words
    public Game(@NotNull String letters) {
        this.chars = letters.toLowerCase().toCharArray();
        for (char c : letters.toLowerCase().toCharArray()) {
            this.charList.add(c);
        }

        this.sides[0] = letters.substring(0, 3).toCharArray();
        this.sides[1] = letters.substring(3, 6).toCharArray();
        this.sides[2] = letters.substring(6, 9).toCharArray();
        this.sides[3] = letters.substring(9, 12).toCharArray();

        Parsing.parseIllegalPairs(this);
        Parsing.buildDictionaries(this);
    }

    public List<Character> getCharList() {
        return charList;
    }

    public char[] getChars() {
        return chars;
    }

    public String[] getIllegalPairs() {
        return illegalPairs;
    }

    public void setIllegalPairs(String[] illegalPairs) {
        this.illegalPairs = illegalPairs;
    }

    HashMap<Character, List<Word>> getDictionaries() {
        return dictionaries;
    }

    List<Word> getDictionary(char c) {
        return this.dictionaries.get(c);
    }

    public void addDictionary(char c, List<Word> dictionary) {
        this.dictionaries.put(c, dictionary);
    }

    public void setSolutions(String[][] solutions) {
        this.solutions = solutions;
    }

    public char[][] getSides() {
        return sides;
    }

    public void setSides(char[][] sides) {
        this.sides = sides;
    }
}




