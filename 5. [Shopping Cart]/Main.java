import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /////// Main shopping Program////////

        // declaring Var
        String item;
        double prize;
        int quantity;
        String currency = "Rs.";
        double total;

        // Assigning var

        System.out.print("Item: ");
        item = sc.nextLine();

        System.out.print("Prize(for 1 item): ");
        prize = sc.nextDouble();

        System.out.print("Item quantity: ");
        quantity = sc.nextInt();

        total = prize * quantity;

        System.out.println("Your order of " + quantity + " " + item + " will be of total " + currency + total);

        sc.close();
    }

}

// update message
