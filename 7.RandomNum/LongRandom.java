import java.util.Random;

public class LongRandom {
    public static void main(String[] args) {

        Random random = new Random();

        long number = random.nextLong();

        System.out.println("Random Long: " + number);
    }
}
