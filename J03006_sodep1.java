package code_ptit;
import java.util.*;
public class J03006_sodep1 {
    private static boolean check(String s){
        for(int i = 0; i < s.length()/2; i++){
            if((s.charAt(i) - '0') % 2 != 0)
                return false;
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
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
