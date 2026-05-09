import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mail = sc.next();
        String username;
        String domain;

        if (mail.contains("@")){
            username = mail.substring(0, mail.indexOf("@"));
            domain = mail.substring(mail.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
        } else{
            System.out.println("Email is not valid");
        }
        sc.close();
    }
}