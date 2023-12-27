import com.opencsv.CSVReader;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Game {

    // Game variables & constants
    protected final List<Character> charList = new ArrayList<>();
    private final String[] illegalPairs;
    private HashMap<Character, List<v2Word>> dictionaries = new HashMap<>(12);
    private String[][] solutions;

    // New game constructor; takes input string of letters & finds list of valid v2Words
    public Game(@NotNull String letters) {
        for (char c : letters.toLowerCase().toCharArray()) {
            this.charList.add(c);
        }

        this.illegalPairs = parseIllegalPairs(letters);
        this.dictionaries = Parsing.buildDictionaries(this);
    }

    protected static String @NotNull [] parseIllegalPairs(String letters) {
        char[][] sides = new char[4][3];
        List<String> pairs = new ArrayList<>();
        sides[0] = letters.substring(0, 3).toCharArray();
        sides[1] = letters.substring(3, 6).toCharArray();
        sides[2] = letters.substring(6, 9).toCharArray();
        sides[3] = letters.substring(9, 12).toCharArray();

        int i, j, k;
        for (i = 0; i < 4; i++) {
            char[] side = Arrays.copyOf(sides[i], 3);
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    String pair = "".concat(String.valueOf(side[j])).concat(String.valueOf(side[k]));
                    if (!pairs.contains(pair)) {
                        pairs.add(pair.toLowerCase());
                    }
                }
            }
        }

        return pairs.toArray(new String[0]);
    }

    public List<Character> getCharList() {
        return charList;
    }

    public String[] getIllegalPairs() {
        return illegalPairs;
    }

    HashMap<Character, List<v2Word>> getDictionaries() {
        return dictionaries;
    }

    public void addDictionary(char c, List<v2Word> dictionary) {
        this.dictionaries.put(c, dictionary);
    }

    public void setSolutions(String[][] solutions) {
        this.solutions = solutions;
    }
}

class Parsing {

    static final Path DICTIONARY = Path.of("src/main/resources/dictionary.csv");
    static final String DICTIONARIES = "src/main/resources/dictionaries/";

    static HashMap<Character, List<v2Word>> buildDictionaries(Game game) {
        List<Character> letters = game.getCharList();
        //ArrayList<List<v2Word>> dictionaries = new ArrayList<>(12);
        HashMap<Character, List<v2Word>> dictionaries = new HashMap<>(12);
        for (char l : letters) {
            List<v2Word> list = new ArrayList<>();
            String newDict = DICTIONARIES + "dict" + String.valueOf(l).toUpperCase() + ".csv";
            Path dictionary = Path.of(newDict);
            try (CSVReader csvReader = new CSVReader(Files.newBufferedReader(dictionary))) {
                String[] line;
                csvReader.readNext();
                while ((line = csvReader.readNext()) != null) {
                    if (validateWord(line[0], game)) {
                        list.add(new v2Word(line));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            dictionaries.put(l, list);
        }
        return dictionaries;
    }

    public static boolean validateWord(String word, Game game) {
        //Check for illegal letters
        for (char c : word.toLowerCase().toCharArray()) {
            return !game.getCharList().contains(c);
        }
        //Check for illegal pairs
        for (String pair : game.getIllegalPairs()) {
            return word.contains(pair.toLowerCase());
        }
        return true;
    }
}

class v2Word {

    public String word;
    private final Double baseScore, adjustedScore;
    private List<Character> uniqueLetters = new ArrayList<>();
    private static int length;
    private int uniqueLetterCount;

    public v2Word(String[] dictLine) {
        this.word = dictLine[0].toLowerCase();
        this.baseScore = Double.parseDouble(dictLine[1]);
        this.adjustedScore = this.baseScore;
        this.uniqueLetterCount = Integer.parseInt(dictLine[2]);

        for (char c : dictLine[3].toLowerCase().toCharArray()) {
            this.uniqueLetters.add(c);
        }

        length = word.length();
    }

    static ListIterator<v2Word> validWordIterator = new ListIterator<v2Word>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public v2Word next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public v2Word previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(v2Word word) {

        }

        @Override
        public void add(v2Word word) {

        }
    };

    public Double getBaseScore() {
        return baseScore;
    }

    public Double getAdjustedScore() {
        return adjustedScore;
    }

    public List<Character> getUniqueLetters() {
        return uniqueLetters;
    }

    public void setUniqueLetters(List<Character> uniqueLetters) {
        this.uniqueLetters = uniqueLetters;
    }

    public int getUniqueLetterCount() {
        return uniqueLetterCount;
    }

    public void setUniqueLetterCount(int uniqueLetterCount) {
        this.uniqueLetterCount = uniqueLetterCount;
    }

    public static int length() {
        return length;
    }
}


class CompareWords implements Comparator<v2Word> {

    @Override
    public int compare(v2Word w1, v2Word w2) {
        return w1.getAdjustedScore().compareTo(w2.getAdjustedScore());
    }
}