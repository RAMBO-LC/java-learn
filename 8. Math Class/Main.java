
public class Main {
    public static void main(String[] args) {

//      System.out.println(Math.PI);
//      System.out.println(Math.pow(2, 2));
//      System.out.println(Math.abs(-10));
//      System.out.println(Math.sqrt(9));
//      System.out.println(Math.round(3.14));
//      System.out.println(Math.ceil(3.14));
//      System.out.println(Math.floor(3.14));
//      System.out.println(Math.max(1, 8));
//      System.out.println(Math.min(1, 8));


         /////HYPOTENEOUS////
         int a = 9;
         int b = 12;

        // double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double c = Math.hypot(a, b);
         System.out.println("Hypotenous: " + c);

    }
}