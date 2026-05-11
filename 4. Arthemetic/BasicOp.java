public class BasicOp {

    public static void main(String[] args) {

        // Declare variables
        int a = 10;
        int b = 5;
        int r;

        // Addition
        r = a + b;
        System.out.println("Addition: " + r); // Output: 15

        // Subtraction
        r = a - b;
        System.out.println("Subtraction: " + r); // Output: 5

        // Multiplication
        r = a * b;
        System.out.println("Multiplication: " + r); // Output: 50

        // Division
        r = a / b;
        System.out.println("Division: " + r); // Output: 2

        // Modulus (remainder)
        r = a % b;
        System.out.println("Modulus: " + r); // Output: 0

        // PEMDAS Example 1
        r = a + b * 2;
        System.out.println("a + b * 2: " + r); // Output: 20

        // PEMDAS Example 2
        r = (a + b) * 2;
        System.out.println("(a + b) * 2: " + r); // Output: 30

    }
}
// update message
