public class checkprime {
    public static void main(String[] args) {
        int n = 18;
        int divisor = 1;
        while (divisor <= n) {
            int rem = n% divisor;
            System.out.println(divisor + "  _ "   + rem);
            divisor = divisor + 1;

        }
    }
}
