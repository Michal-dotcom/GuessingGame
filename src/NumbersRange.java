import java.util.Random;

public class NumbersRange {
    public static int numbersRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
