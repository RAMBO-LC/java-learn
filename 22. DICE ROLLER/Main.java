import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ///
        int total = 0;
        /// 
        System.out.print("no. of dice: ");
        int noOfDice = sc.nextInt();

        if (noOfDice > 0){
            for (int i = 0; i < noOfDice; i++){
                int roll = rd.nextInt(1, 7);
                System.out.println("rolled number " + i + " is : " + roll);
                total += roll;
                ascii(roll);
            }
            System.out.println("total of roll is " + total );            
        }
        else{
            System.out.println("no. of dice should be more than 0");
        }
        sc.close();
    }
    /////ASCII/////
    
    static void ascii(int roll){
        if (roll == 1){
            System.out.println("┏━━━━━┓");
            System.out.println("┃  ●  ┃");
            System.out.println("┗━━━━━┛");
        }
        if (roll == 2){
            System.out.println("┏━━━━━┓");
            System.out.println("┃●   ●┃");
            System.out.println("┗━━━━━┛");
        }  
        if (roll == 3){
            System.out.println("┏━━━━━┓");
            System.out.println("┃● ● ●┃");
            System.out.println("┗━━━━━┛");
        }
        if (roll == 4){
            System.out.println("┏━━━━━┓");
            System.out.println("┃●   ●┃");
            System.out.println("┃●   ●┃");
            System.out.println("┗━━━━━┛");
        }          
        if (roll == 5){
            System.out.println("┏━━━━━┓");
            System.out.println("┃●   ●┃");
            System.out.println("┃  ●  ┃"); 
            System.out.println("┃●   ●┃");
            System.out.println("┗━━━━━┛");
        }
        if (roll == 6){
            System.out.println("┏━━━━━┓");
            System.out.println("┃● ● ●┃");
            System.out.println("┃● ● ●┃");
            System.out.println("┗━━━━━┛");
        }                

    }
    //RUN THIS IN THE TERMINAL IF IT DOESNT RECOGNISES THE CHARACTERS
    ///////////////////////////////////////////////////////////////////////////////////////
    //                                                                                   //
    //   chcp 65001                                                                      //
    //   $OutputEncoding = [Console]::OutputEncoding = [System.Text.UTF8Encoding]::new() //
    //                                                                                   //
    //                                                                                   //
    ///////////////////////////////////////////////////////////////////////////////////////
}