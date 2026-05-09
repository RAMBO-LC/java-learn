import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String unit;
        double temp;
        double newTemp;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("convert to C or F: ");
        unit = sc.next().toUpperCase();        

        System.out.print("Enter tepmperature: ");
        temp = sc.nextDouble();

        newTemp = (unit.equals("C")) ? ((temp - 32 ) * 5 / 9) : ((temp * 9/5) + 32);

        System.out.println(newTemp + unit);
        
        sc.close();
    }
}