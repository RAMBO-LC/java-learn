import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char sym;
        int row;
        int col;

        System.out.print("Enter your symbol : ");
        sym =  sc.next().charAt(0);

        System.out.print("Enter your no. of columns : ");
        col = sc.nextInt();
        
        System.out.print("Enter your no. of rows : ");
        row = sc.nextInt();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(sym + " ");
            }

            System.out.println();
        }
        
        sc.close();
    }
}