import java.util.Scanner;
import java.net.Socket;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1, 100);
        int guess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game");

        while (number != guess){
            System.out.print("Enter your guess:");
            guess = sc.nextInt();

            if (guess > number){
                System.out.println("Your guess is higher than the Number");
                attempts++;
            }
            else if (guess < number){
                System.out.println("Your guess is Lower than the Number");
                attempts++;
            }
            else{
                System.out.println("Correct guess");
                
            }

            
        }

        

        sc.close();
    }
}