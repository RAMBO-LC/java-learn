import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double bal = 1000;

        int option;
    
        while (true){
            System.out.println("");
            System.out.println("WELCOME TO ABC BANK");
            System.out.println("////////////////////////////////");
            System.out.println("1 : check balance");
            System.out.println("2 : deposit");
            System.out.println("3 : withdraw");
            System.out.println("4 : exit");
            System.out.println("");
            System.out.println("Choise (1 - 4) : ");
            option= sc.nextInt();

            switch (option) {
                case 1 -> System.out.println("Your balances is : " + bal);
                case 2 -> bal = deposit(bal, sc);
                case 3 -> bal = withdraw(bal, sc);
                case 4 -> {System.out.println("Exiting...");
                sc.close();
                return;
                }
                default -> System.out.println("Invalid option");
            }
            System.out.print("Do you want to continue? (y/n): ");
                char choice = sc.next().toLowerCase().charAt(0);

            if (choice != 'y') {
                System.out.println("Thank you for using ABC BANK");
                sc.close();
                return;
            }
        }
    }    

        static double deposit(double bal, Scanner sc){
            System.out.print("enter your amt to deposit: ");
            double depo = sc.nextInt();
            bal += depo;

            System.out.println("Your new balance is : " + bal);
            return bal;            
        }

        static double withdraw(double bal, Scanner sc){
            System.out.print("enter your amt to withdraw: ");
            double wtrw = sc.nextInt();
            if ( bal < wtrw){
                System.out.println("insuficient balance");
                return bal;  
            } else {
                bal -= wtrw;
                System.out.println("Your new balance is : " + bal);
                return bal;  
            }
        }    
        
}