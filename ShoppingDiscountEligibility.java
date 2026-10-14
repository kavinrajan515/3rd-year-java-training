import java.util.Scanner;

public class ShoppingDiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: ");
        double amount = sc.nextDouble();

        String result = (amount >= 100) ? "Eligible for Discount" : "Not Eligible for Discount";

        System.out.println(result);

        sc.close();
    }
}
