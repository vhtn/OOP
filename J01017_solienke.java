package code_ptit;
import java.util.Scanner;
public class J01017_solienke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            boolean check = true;
            for(int i = 1; i < s.length(); i++){
                int x = s.charAt(i) - '0';
                int y = s.charAt(i - 1) - '0';
                if(Math.abs(x - y) != 1){
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
