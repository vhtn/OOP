package code_ptit;
import java.util.*;
public class J03016_chiahetcho11 {
    public static boolean check(String s){
        int c = 0, l = 0;
        for(int i = 0 ; i < s.length(); i ++){
            if(i % 2 == 1)
                c += (s.charAt(i) - '0');
            else l += (s.charAt(i) - '0');
        }
        if(c == l || Math.abs(c - l) % 11 == 0)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(check(s))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
