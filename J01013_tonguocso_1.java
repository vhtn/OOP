package code_ptit;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class J01013_tonguocso_1 {
    private static ArrayList<Integer> ngto;
    private static void init(){
        int MAXN = 2000000;
        boolean[] check = new boolean[MAXN + 1];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for(int i = 2; i <= Math.sqrt(MAXN); i++){
            if(check[i]){
                for(int j = i * i; j < MAXN; j += i){
                    check[j] = false;
                }
            }
        }
        ngto = new ArrayList<>();
        for(int i = 2; i < MAXN; i++){
            if(check[i])
                ngto.add(i);
        }
    }
    public static void main(String[] args){
        init();
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(Integer it : ngto){
                if (it * it > n)
                    break;
                while(n % it == 0){
                    sum += it;
                    n /= it;
                }
            }
                if(n > 1)
                    sum += n;
        }
        System.out.println(sum);
    }
}
