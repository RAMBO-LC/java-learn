import java.util.Scanner;

public class inInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("whats your age?");
        int age = sc.nextInt();

        System.out.println(" your age : " + age);
        sc.close();
    }

}
