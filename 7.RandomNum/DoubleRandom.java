import java.util.Random;

public class DoubleRandom {
    public static void main(String[] args) {

        Random random = new Random();

        double number = random.nextDouble();

        System.out.println("Random Double: " + number);
    }
}