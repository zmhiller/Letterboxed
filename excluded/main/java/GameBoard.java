import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GameBoard {

    final List<Character> charList = new ArrayList<>();
    private final char[][] sides;
    private final String[] illegalPairs;
    private final List<Word> validWords = new ArrayList<>();

    GameBoard(@NotNull String letters) {
        for (char c : letters.toLowerCase().toCharArray()) {
            this.charList.add(c);
        }
        this.sides = Parsers.parseSides(this);
        this.illegalPairs = Parsers.parseIllegalPairs(this);
    }

    public List<Character> getCharList() {
        return charList;
    }

    @Override
    public String toString() {
        return charList.toString();
    }

    public char[][] getSides() {
        return sides;
    }

    public String[] getIllegalPairs() {
        return illegalPairs;
    }

    public List<Word> getValidWords() {
        return validWords;
    }

    public void addValidWord(Word word) {
        this.validWords.add((word));
    }


}

