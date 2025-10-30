package code_ptit;
import java.util.Scanner;
public class J01022_xaunhiphan{
    private static long[] fibo;
    private static void init(){
        fibo = new long[93];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i < 93; i++){
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
    }
    private static char find(int n, long k){
        if(n == 1)
            return '0';
        if(n == 2)
            return '1';
        if(k <= fibo[n-2])
            return find(n - 2, k);
        else
            return find(n - 1, k - fibo[n - 2]);
    }
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            char res = find(n, k);
            System.out.println(res);
        }
    }
}
