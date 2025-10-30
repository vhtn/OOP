package code_ptit;
import java.util.Scanner;
public class J01014_uocsonguyentolonnhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n % i == 0){
                    x = i;
                    n /= i;
                }
            }
            if(n > 1)
                x = n;
            System.out.println(x);
        }
    }
}
