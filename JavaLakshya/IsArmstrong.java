import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int original = num;
        int digits = countDigits(num);
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

