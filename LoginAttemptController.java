import java.util.Scanner;

public class LoginAttemptController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        String result = (username.equals("admin") && password.equals("password123")) ? "Login Successful" : "Login Failed";

        System.out.println(result);

        sc.close();
    }
    
}
