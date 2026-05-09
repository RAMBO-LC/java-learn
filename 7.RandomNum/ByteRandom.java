import java.util.Random;

public class ByteRandom {
    public static void main(String[] args) {

        Random random = new Random();

        byte number = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.println("Random Byte: " + number);
    }
}