import java.util.Random;

public class ShortRandom {
    public static void main(String[] args) {

        Random random = new Random();

        short number = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.println("Random Short: " + number);
    }
}