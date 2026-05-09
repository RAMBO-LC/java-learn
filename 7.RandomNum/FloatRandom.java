import java.util.Random;

public class FloatRandom {
    public static void main(String[] args) {

        Random random = new Random();

        float number = random.nextFloat();

        System.out.printf("Random Float: %.5f", number);
    }
}