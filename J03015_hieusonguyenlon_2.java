package code_ptit;
import java.util.*;
import java.math.*;
public class J03015_hieusonguyenlon_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger hieu = a.subtract(b);
        System.out.println(hieu);
    }
}
