import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double depo;
        double wtdr;
        double balance = 20000;
        int opt;
        
        while (true){
            System.out.println("////////////////");
            System.out.println(" BANKING SYSTEM ");
            System.out.println("////////////////");
            System.out.println("select your option");
            System.out.println("");
            System.out.println("1 : to view balance");
            System.out.println("2 : to deposit");
            System.out.println("3 : to withdraw");
            System.out.println("4 : to exit");
            System.out.println("");
            opt = sc.nextInt();

            if (opt == 1){
                System.out.println("your balance is : " + balance);
            } else if (opt == 2){
                System.out.println("enter amount to deposit : ");
                depo = sc.nextInt();
                balance += depo;
                System.out.println("your deposit of " + depo + "has been added");
                System.out.println("Your new balance is " + balance);
            }
            else if (opt == 3){
                System.out.println("enter amount to withdraw : ");
                wtdr = sc.nextInt();
                balance -= wtdr;
                System.out.println("your withdraw of " + wtdr + " is successfull");
                System.out.println("Your new balance is " + balance);
            }else if (opt == 4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid option");
            }
        }
            
        sc.close();
    }
}