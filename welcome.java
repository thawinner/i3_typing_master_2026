import java.util.Scanner;

public class welcome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------------- Welcome to I3 Typing Master v2026 -------------");
            System.out.println("To Begin, please select one of the following options:");
            System.out.println("1. User registering");
            System.out.println("2. User reset password");
            System.out.println("3. User login");
            System.out.println("4. List of test results for a user");
            System.out.println("5. User typing test");
            System.out.println("6. About Us");
            System.out.println("7. Exit");
            System.out.print("Choose an option: - ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Register register = new Register();
                    register.showRegistration();
                    break;
                case 2:
                    ResetPassword resetPassword = new ResetPassword();
                    resetPassword.reset();
                    break;
                case 3:
                    Login login = new Login();
                    login.show();
                    break;
                

            }
        } while (choice != 7);
        sc.close();
    }
}