import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();

        int count = 1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
    
}
