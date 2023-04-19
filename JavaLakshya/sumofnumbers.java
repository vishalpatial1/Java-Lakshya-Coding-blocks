import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Calculate the sum of the first n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of the first " + n + " numbers: " + sum);
    }
}
