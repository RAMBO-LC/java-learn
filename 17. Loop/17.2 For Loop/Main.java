public class Main {
    public static void main(String[] args) throws InterruptedException 
    {
        int max = 10;

        for (int i =  max; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("LAUNCH!");

    }
}