import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // WEIGHT CONVERTOR PROGRAMM//

        double weight;
        double newWeight;
        int choice;

        // WELCOME USERS
        System.out.println("WELCOME TO WEIGHT CONVERTOR");
        System.out.println("option 1 : lbs to kg");
        System.out.println("option 2 : kg to lbs");

        // user prompt( option 1 or 2)

        choice = sc.nextInt();

        if (choice == 1) {
            // option 1 : lbs to kg
            System.out.println("lbs:");
            weight = sc.nextDouble();
            newWeight = weight / 2.20462262185;
            System.out.println(newWeight + " kg");
        } else {
            // option 2 : kg to lbs
            System.out.println("kg:");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462262185;
            System.out.println(newWeight + " lbs");
        }

        sc.close();
    }
}
// update message
