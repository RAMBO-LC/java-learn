import java.util.Random;

public class CharRandom {
    public static void main(String[] args) {

        Random random = new Random();

        char letter = (char) ('A' + random.nextInt(26));

        System.out.println("Random Char: " + letter);
    }
}
