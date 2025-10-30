package code_ptit;
import java.util.*;
import java.io.*;
import java.math.*;
public class j07003_tachdoivatinhtong {
    public static String tach(String s){
        int mid = s.length()/2;
        BigInteger x1 = new BigInteger(s.substring(0, mid));
        BigInteger x2 = new BigInteger(s.substring(mid));
        return x1.add(x2).toString();
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length() > 1){
            s = tach(s);
            System.out.println(s);
        }
    }
}
