package code_ptit;
import java.util.Scanner;
public class J01018_sokhonglienke {
    private static boolean check(String s){
        long sum = s.charAt(0) - '0';
        for(int i = 1; i < s.length(); i++){
            int x = s.charAt(i) - '0';
            int y = s.charAt(i-1) - '0';
            if(Math.abs(x - y) != 2)
                return false;
            sum += x;
        }
        if(sum % 10 != 0)
            return false;
        return true;
    } 
    public static void main(String[] args){
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
