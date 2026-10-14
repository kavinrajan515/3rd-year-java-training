import java.util.Scanner;

public class ATMWithdrawalValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = sc.nextDouble();

        String result = (withdrawalAmount <= balance) ? "Withdrawal Successful" : "Insufficient Balance";

        System.out.println(result);

        sc.close();
    }
    
}
