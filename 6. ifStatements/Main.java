import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an ADULT");

        } else if (age < 3) {
            System.out.println("You are a NEWBORN BABY");

        } else if (age <= 3) {
            System.out.println("You are a BABY");

        } else if (age < 18) {
            System.out.println("You are a MINOR");

        } else {
            System.out.println("ERROR");
        }

        sc.close();
    }
}
// update message
