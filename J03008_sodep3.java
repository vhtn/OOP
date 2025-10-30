package code_ptit;
import java.util.*;
public class J03008_sodep3 {
    private static boolean ngto(char c){
        int n = c - '0';
        if(n <  2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
    private static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(!ngto(s.charAt(i)))
                return false;
            if(s.charAt(i) != s.charAt(s.length() - i -1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
