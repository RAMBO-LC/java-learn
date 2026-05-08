import java.util.Scanner;

public class inBool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a student? (true/false)");

        boolean isStu = sc.nextBoolean();

        if (isStu == true) {
            System.out.print("You are a student");
        } else {
            System.out.print("You are NOT a student");
        }

        sc.close();

    }

}
