import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Raj Ambolikar";

        int length = name.length();
        char letter = name.charAt(12);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase(); //RAJ AMBOLIKAR
        //name = name.toLowerCase(); // raj ambolikar
        //name = name.trim(); // this will remove the space 
                              // from before and after the string

        //name = name.replace(" ", "u ");// Raju Ambolikar

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty()); //false
        System.out.println(name.contains("r"));//true
        System.out.println(name.equals("raj ambolikar "));//false
        System.out.println(name.equalsIgnoreCase("raj ambolikar"));//true
    }
}
// update message
