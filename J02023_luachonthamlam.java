package code_ptit;
import java.util.*;
public class J02023_luachonthamlam {
    public static String soLon(int n, int s){
        String res = "";
        while(res.length() < n){
            int tmp = Math.min(9, s);
            res += (char) ('0' + tmp);
            s -= tmp;
        }
        return res;
    }
    public static String soNho(int n, int s){
        String res = "";
        while(res.length() < n){
            int k;
            if(res.length() == 0)
                k = 1;
            else
                k = 0;
            for(int i = k; i < 10; i++){
                int tmp = s - i;
                if(tmp < 0)
                    break;
                if(tmp <= 9 * (n - res.length() - 1)){
                    res += (char)('0' + i);
                    s -= i;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(s == 0){
            if (n == 1)
                System.out.println("0 0");
            else
                System.out.println("-1 -1");
        }
        else if(s > 9 * n)
            System.out.println("-1 -1");
        else{
            System.out.println(soNho(n, s) + " " + soLon(n, s));
        }
    }
}
