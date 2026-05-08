import java.util.Scanner;

public class inInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // nextInt() -> reads integer values
        System.out.print("What's your age? (nextInt()): ");
        int age = sc.nextInt();

        // nextDouble() -> reads decimal values
        System.out.print("What's your GPA? (nextDouble()): ");
        double gpa = sc.nextDouble();

        // Output
        System.out.println("\nYour age is: " + age);
        System.out.println("Your GPA is: " + gpa);

        sc.close();
    }
}