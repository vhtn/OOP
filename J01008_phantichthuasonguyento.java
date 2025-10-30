
package code_ptit;
import java.util.Scanner;
public class J01008_phantichthuasonguyento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            System.out.print("Test " + k  + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++){
                int mu = 0;
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                if(mu > 0)
                    System.out.print(i + "(" + mu + ") ");
            }
            if(n > 1){
                System.out.print(n + "(" + 1 + ")");
            }
            System.out.println();
        }
    }
}
