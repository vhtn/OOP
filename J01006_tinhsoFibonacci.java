package code_ptit;
import java.util.Scanner;
public class J01006_tinhsoFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] fibo;
        fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            System.out.println(fibo[x]);
        }
    }
}
