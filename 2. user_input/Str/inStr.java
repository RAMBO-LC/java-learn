import java.util.Scanner;

public class inStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== STRING INPUT =====

        // nextLine() -> reads full line including spaces
        System.out.print("Enter your name( test `nextLine()` ): ");
        String Name1 = sc.nextLine();

        // next() -> reads only until first space
        System.out.print("\nEnter your name (test `next()`): ");
        String Name2 = sc.next();

        // ===== OUTPUT =====

        System.out.println("\nUsing nextLine() : " + Name1);
        System.out.println("\nUsing next() : " + Name2);

        sc.close();
    }
}
// update message
