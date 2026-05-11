import java.util.Scanner;
import java.net.Socket;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1, 100);
        int guess = 0;
        int attempts = 5;

        System.out.println("Number Guessing Game");

        while (number != guess && attempts > 0 ){
            System.out.println("You have " + attempts + " attempts");
            System.out.print("Enter your guess:");
            guess = sc.nextInt();

            
            if (guess > number){
                System.out.println("Your guess is HIGHER than the Number");
                attempts--;
            }
            else if (guess < number){
                System.out.println("Your guess is LOWER than the Number");
                attempts--;
            }

            else{
                System.out.println("Correct guess");
                
            }
        }
        
        if (attempts == 0){
            System.out.println("GAME OVER");
            System.out.println("The correct number was " + number); 
        }

        sc.close();
    }
}