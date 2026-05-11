import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enhanced Switch = A replacement to many 'else-if' statements
        // for example lets make a WeekDays and WeekEnds
        System.out.print("day: ");
        String day = sc.next().toLowerCase();

        switch (day) {
            case "monday","tuesday", "wednesday", "thursday", "friday" ->
            System.out.println(day.toUpperCase() + " is a weekDAY");
            case "saturday", "sunday" -> 
            System.out.println(day.toUpperCase() + " is a weekEND");
            default -> System.out.println(day.toUpperCase() + " is not a day");
             
        }
        sc.close();
    }
}
// update message
