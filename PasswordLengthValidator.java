import java.util.Scanner;

public class PasswordLengthValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        String result = (password.length() >= 8) ? "Valid Password" : "Invalid Password";

        System.out.println(result);

        sc.close();
    }
    
}
