import java.util.Comparator;

public class CompareWords implements Comparator<Word> {

    @Override
    public int compare(Word w1, Word w2) {
        return w1.getAdjustedScore().compareTo(w2.getAdjustedScore());
    }
}