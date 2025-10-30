package code_ptit;
import java.util.Scanner;
public class J01007_kiemtrasoFibonacci {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        long fibo[];
        fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int find = 0;
            long x = sc.nextLong();
            for(int i = 0; i < 93; i++){
                if(x == fibo[i])
                    find = 1;
            }
            if(find == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
