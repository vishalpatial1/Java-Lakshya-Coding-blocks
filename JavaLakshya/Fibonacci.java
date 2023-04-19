import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the number of terms they want to generate
        System.out.print("Enter the number of terms in the series: ");
        int numTerms = sc.nextInt();
        
        // Generate and print the Fibonacci series
        int a = 0, b=1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(a + " ");
             c = a + b;
             a = b;
             b = c;

           
        }
    }
}
