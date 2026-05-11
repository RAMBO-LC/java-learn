import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 10; i++){

            if (i == 5){
                continue;
            }

            System.out.print(i + " ");
            Thread.sleep(1100);
        }

        

        sc.close();
    }
}