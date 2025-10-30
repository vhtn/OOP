package code_ptit;
import java.math.*;
import java.util.*;
public class J03011_uocsochunglonnhatcuasonguyenlon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            System.out.println(ucln);
        }
    }
}
