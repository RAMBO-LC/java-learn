import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double finalAmt;

        System.out.print("Enter the principle amt. : ");
        principle = sc.nextDouble();

        System.out.print("Enter the Rate(%) : ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the No. of times compounted per year : ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the No. of years : ");
        years = sc.nextInt();


        finalAmt = (Math.pow(1 + (rate/timesCompounded), timesCompounded * years)) * principle;

        System.out.printf("Final amt. : $%f", finalAmt );
        sc.close();
    }
}