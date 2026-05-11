
import java.util.Scanner;

public class Main {
    // MAD LIBS GAMES

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // declaring var

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.println("LET'S DESCRIBE A ZOOO!!!!!");
        // assigning var
        System.out.print("Enter a Adjective (desciption): ");
        adj1 = sc.nextLine();

        System.out.print("Enter a noun(animal): ");
        noun1 = sc.nextLine();

        System.out.print("Enter a Adjective (desciption): ");
        adj2 = sc.nextLine();

        System.out.print("Enter a verb (current action -ing): ");
        verb1 = sc.nextLine();

        System.out.print("Enter a Adjective (desciption): ");
        adj3 = sc.nextLine();

        // LETS DESCRIBE A ZOO!!!

        System.out.println("Today i went to a " + adj1 + " Zoo! ");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");
        sc.close();
    }
}

// update message
