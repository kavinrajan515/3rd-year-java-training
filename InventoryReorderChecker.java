import java.util.Scanner;

public class InventoryReorderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current inventory level: ");
        int inventoryLevel = sc.nextInt();

        System.out.print("Enter the reorder threshold: ");
        int reorderThreshold = sc.nextInt();

        String result = (inventoryLevel <= reorderThreshold) ? "Reorder Needed" : "No Reorder Needed";

        System.out.println(result);

        sc.close();
    }
    
}
