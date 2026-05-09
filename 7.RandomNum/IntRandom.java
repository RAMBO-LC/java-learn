import java.util.Random;

public class IntRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(1, 101);

        System.out.println("Random Int: " + number);
    }
}