import junit.framework.TestCase;

public class ScoringTests extends TestCase implements Scoring {


    public void testWeightMultipliers() {
        applyWeights(TEST_ITEMS.PARSED_WORD, TEST_ITEMS.TEST_WEIGHTS);
    }

    @Override
    public void applyWeights(Word word, double[] weights) {
        String[] wordArr = new String[]{word.toString(), String.valueOf(weights[0]), String.valueOf(weights[1])};
    }
}
