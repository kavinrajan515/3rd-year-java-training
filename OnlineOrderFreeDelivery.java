import java.util.Scanner;

public class OnlineOrderFreeDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your order amount: ");
        double orderAmount = sc.nextDouble();

        String result = (orderAmount >= 50) ? "Eligible for Free Delivery" : "Not Eligible for Free Delivery";

        System.out.println(result);

        sc.close();
    }
    
}
