public class Main {
    public static void main(String[] args) {
        double a ;
        double b ;
        double c ;
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 3));

    }

    static double add( double a, double b){
        return a + b;
    }
 
    static double add( double a, double b, double c){
        return a + b + c;
    }    
}