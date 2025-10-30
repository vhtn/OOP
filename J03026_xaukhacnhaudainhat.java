package code_ptit;
import java.util.*;
public class J03026_xaukhacnhaudainhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            if (a.equals(b)){
                System.out.println(-1);
            }
            else{
                int res = Math.max(a.length(), b.length());
                System.out.println(res);
            }
        }
    }
}
