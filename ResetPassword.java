import java.util.Scanner;

public class ResetPassword {
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---- Reset Password ----");
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter new password: ");
        String newPass = sc.nextLine();
        System.out.println("Success: Password updated for " + user);
    }
}