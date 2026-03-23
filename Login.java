import java.util.Scanner;

public class Login {
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---- Authentication ----");
        System.out.print("Username (left blank to cancel): ");
        String user = sc.nextLine();
        if (user.isEmpty()) return;

        System.out.print("Password: ");
        String pass = sc.nextLine();
        
        // Simple logic for midterm demonstration
        System.out.println("Welcome back, " + user + "!");
    }
}