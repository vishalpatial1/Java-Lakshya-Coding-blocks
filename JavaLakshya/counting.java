
import java.util.Scanner;

public class counting { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Print counting from 1 to n
        System.out.println("Counting from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
 
    
}
