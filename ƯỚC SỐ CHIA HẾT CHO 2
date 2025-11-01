
package code_ptit;
import java.util.Scanner;
public class J01012_uocsochiahetcho2 {
    private static int uocso(int n){
        if(n % 2 != 0)
            return 0;
        int cnt = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0){
                    cnt++;
                }
                int j = n / i;
                if(j % 2 == 0 && j != i)
                    cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(uocso(n));
        }
    }
}
