import java.util.Scanner;

public class rectArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of Rectangle
        // formula: length * breadth
        double l = 0;
        double b = 0;
        double area = 0;

        System.out.print("length : ");
        l = sc.nextDouble();

        System.out.print("breath : ");
        b = sc.nextDouble();

        area = (l * b);

        System.out.println("area of rectangle " + area + " units sq. ");

        sc.close();
    }

}
