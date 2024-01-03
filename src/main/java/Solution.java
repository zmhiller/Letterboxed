import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Solution {
    private final List<Word> words;
    private double totalScore;

    public Solution(List<Word> solution) {
        this.words = solution;
        for (Word word : solution) {
            this.totalScore += word.getAdjustedScore();
        }
    }

    public int getLength() {
        return this.words.size();
    }

    public String toString() {
        String solution = "";
        for (Word word : this.words) {
            solution = solution.concat(String.format("Word %d: '%s' | ", this.words.indexOf(word), word.getWord()));
        }
        solution = solution.concat(String.format("\n\tTotal Score: %f", this.totalScore));
        return solution;
    }

    // Void return; Game object will hold Solution Set property which can be updated directly via set method
    // Enables iterative calls to findSolution()
    public static void findSolution(HashMap<String, List<Word>> dictionaries, String validLetters) {
        List<Word> words = new ArrayList<>();
        Dictionaries.sortDictionaries(dictionaries);
        List<Word> topWords = Dictionaries.getTopScoringWords(dictionaries);

    }
/*
    public static void main(String[] args) {
        final String validLetters = "abcdefghijkl";
        final List<String> INVALID_PAIRS = List.of("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll");
        HashMap<String, List<Word>> dictionaries = Dictionaries.buildDictionaries(validLetters, INVALID_PAIRS);
        List<List<Word>> solutions = findSolutionSet(dictionaries, validLetters);
        System.out.println(solutions.get(0));
    }

 */
}

