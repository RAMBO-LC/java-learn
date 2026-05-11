public class Main {

    public static void main(String[] args) {

        // LOGICAL OPERATORS
        // && = AND
        // || = OR
        // !  = NOT

        // =========================
        // AND OPERATOR (&&)
        // =========================

        int age = 20;
        int option = 1;

        // option 1 = VIP member
        // option 0 = Normal user

        if (age >= 18 && option == 1) {
            System.out.println("VIP Access Granted");
        }

        // =========================
        // OR OPERATOR (||)
        // =========================

        int student = 0;
        int seniorCitizen = 1;

        // 1 = YES
        // 0 = NO

        if (student == 1 || seniorCitizen == 1) {
            System.out.println("Discount Available");
        }

        // =========================
        // NOT OPERATOR (!)
        // =========================

        boolean banned = false;

        if (!banned) {
            System.out.println("You Can Enter");
        }

        // =========================
        // COMBINED EXAMPLE
        // =========================

        String username = "raj";
        String password = "1234";

        if (username.equals("raj") && password.equals("1234")) {
            System.out.println("Login Successful");
        }

    }
}
// update message
