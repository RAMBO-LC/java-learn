public class Main {

    static int x = 3; //class
    public static void main(String[] args) {
    
        int x =1; // LOCAL (only inside main)
        System.out.println(x + " main()");
        doSomthing();
        
    }

    static void doSomthing(){
        int x = 2; // LOCAL (only inside doSomething() method)
        System.out.println(x + " doSomething() method");
    }
}

//variable scope = > where an variable 
// can be ACCESSed.
//-------------------------------------
//local variables override global 
//variables inside their method.