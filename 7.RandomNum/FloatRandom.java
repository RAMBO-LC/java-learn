import java.util.Random;

public class FloatRandom {
    public static void main(String[] args) {

        Random random = new Random();

        float number = random.nextFloat();

        System.out.println("Random Float: " + number);
    }
}