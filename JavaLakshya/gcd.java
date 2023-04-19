public class gcd {
    public static void main(String[] args) {
        int n1 =18;
        int n2 =12;

        int dividend = n2;
        int divisor = n1;
        int rem = 1000;
        while(rem>0){

        
            int rem = dividend % divisor ;
            dividend = divisor;
            divisor = rem;
         
        System.out.println(dividend);
        }
    }
}
