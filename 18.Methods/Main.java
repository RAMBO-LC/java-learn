public class Main {
    public static void main(String[] args) {
        int age = 10;

        if(agever(age)){
            System.out.println("you may signup!");
        } else{
            System.out.println("you must be atleast 18");
        }
    }

    static boolean agever(int age){
        if (age >=18){
            return true;
        } else {
            return false;
        }

    }
}

//Method => a block of reusable code
// that is executed when called ()