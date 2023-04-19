
    import java.util.Scanner;
    public class fibonaccilakshya {



   public static void main (String[]args)
   {
       Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     int cnt = 0;
     int a = 0;
     int b = 1;
     int c = 0;
     while (cnt<N){
         c= a+b;
         a=b;
         b=c;
         cnt++;
     }
     System.out.println(a);
   }
 }

