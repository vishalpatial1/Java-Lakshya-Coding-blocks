import java.util.Scanner;

public class primenotprime {
    

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
      int div = 1;
      int factor =0;
      while(div<=N){
          int rem = N%div;
          if (rem==0){
               factor = factor+1;
             
          }
          div++;

         

      }
      if (factor==2){
          System.out.println("Prime");

      }else{
          System.out.println("Not Prime");
      }
    
}
    
}
