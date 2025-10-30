package code_ptit;
import java.util.*;
public class J03007_sodep2 {
    private static boolean check(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 != 0)
            return false;
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8')
            return false;
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
