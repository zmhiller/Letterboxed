public class GameBoard {
    private final char[][] sides;

    public GameBoard(String letters) {
        this.sides = getSides(letters);
    }

    protected static char[][] getSides(String letters) {
        char[][] sides = new char[4][3];
        int l = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sides[i][j] = letters.toCharArray()[l];
                l++;
            }
        }
        return sides;
    }
}
