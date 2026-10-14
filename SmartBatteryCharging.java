import java.util.Scanner;

public class SmartBatteryCharging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current battery percentage: ");
        int batteryPercentage = sc.nextInt();

        String result = (batteryPercentage < 20) ? "Battery is low. Please charge your device." : "Battery level is sufficient.";

        System.out.println(result);

        sc.close();
    }
    
}
