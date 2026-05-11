public class Main {

// ternary operator ( ? )    
//return 1 of 2 value if condition is true
//variable = (condition) ? iftrue : iffalse  

    public static void main(String[] args) {
        int score = 71;

        String PassOrFail = (score >=60) ? "PASS" : "FAIL";

        String EvenOrOdd = (score % 2 == 0) ? "Even" : "ODD";
        System.out.println(EvenOrOdd);

    }
}
// update message
