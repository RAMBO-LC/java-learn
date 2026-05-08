
import java.util.Scanner;

public class issue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age");
        int age = sc.nextInt();
        sc.nextLine(); // this fixs the issue by consuming the
                       // left out newline character

        System.out.print("enter your fav color");
        String color = sc.nextLine();

        System.out.print("you are " + age + " years old");
        System.out.print("your fav color is " + color);

        sc.close();

    }

}
