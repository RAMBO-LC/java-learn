import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int Number = random.nextInt(1, 4);

        System.out.println(Number);

        System.out.print("Enter a Number (1 to 4): ");
        int guess1 =sc.nextInt();
        System.out.print("Enter a Number (1 to 4): ");
        int guess2 =sc.nextInt();
        System.out.print("Enter a Number (1 to 4): ");
        int guess3 =sc.nextInt();

        if (guess < Number) {
            System.out.println("your guess is smaller than Number");
        } else if (guess > Number) {
            System.out.println("your guess is greater than Number");
        } else {
            System.out.println("Your guess is correct");
        }
        sc.close();
    }
}   