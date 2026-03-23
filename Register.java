import java.util.Scanner;

public class Register {
    public void showRegistration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- New User Registration ----");
        System.out.print("Input a unique username (left blank to cancel): ");
        String username = sc.nextLine();
        System.out.print("Input password: ");
        String pass = sc.nextLine();
        System.out.print("Input confirm password: ");
        String confirm = sc.nextLine();
        
        if(pass.equals(confirm)) System.out.println("Registration Successful!");
        else System.out.println("Passwords do not match.");
    }
}