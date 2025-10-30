package code_ptit;
import java.util.*;
import java.math.*;
public class J03013_hieusonguyenlon_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            int maxLen = Math.max(x.toString().length(), y.toString().length());
            BigInteger hieu = x.subtract(y).abs();
            String res = hieu.toString();
            while(res.length() < maxLen){
                res = '0' + res;
            }
            System.out.println(res);
        }
    }
}
