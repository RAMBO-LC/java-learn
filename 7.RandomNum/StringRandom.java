import java.util.Random;

public class StringRandom {
    public static void main(String[] args) {

        Random random = new Random();

        String[] names = { "Raj", "Alex", "John", "Rhea" };

        String randomName = names[random.nextInt(names.length)];

        System.out.println("Random String: " + randomName);
    }
}