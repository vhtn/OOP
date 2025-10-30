package code_ptit;
import java.util.*;
public class J03024_souuthe {
    public static String check(String s){
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++){
            if('0' > s.charAt(i) || s.charAt(i) > '9')
                return "INVALID";
            int num = s.charAt(i) - '0';
            if(num % 2 == 0)
                cnt1++;
            else cnt2++;
        }
        if (cnt1 > cnt2 && s.length() % 2 == 0)
            return "YES";
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
