
package code_ptit;
import java.util.Scanner;
import java.math.BigInteger;
public class J01011_boisochung_uocsochung {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger uc = a.gcd(b);
            System.out.println(a.multiply(b).divide(uc) + " " + uc);
        }
    }
}
