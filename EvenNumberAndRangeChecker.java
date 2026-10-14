import java.util.Scanner;

public class EvenNumberAndRangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String evenOddResult = (number % 2 == 0) ? "Even" : "Odd";
        String rangeResult = (number >= 1 && number <= 100) ? "Within Range" : "Out of Range";

        System.out.println(evenOddResult);
        System.out.println(rangeResult);

        sc.close();
    }
}



