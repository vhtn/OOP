package code_ptit;
import java.util.*;
public class J03021_dienthoaicucgach {
    public static boolean check(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == 'A' || c == 'B' || c == 'C' || c == 'a' || c == 'b' || c == 'c')
                    res += '2';
                else if(c == 'D' || c == 'E' || c == 'F' || c == 'd' || c == 'e' || c == 'f')
                    res += '3';
                else if(c == 'G' || c == 'H' || c == 'I' || c == 'g' || c == 'h' || c == 'i')
                    res += '4';
                else if(c == 'J' || c == 'K' || c == 'L' || c == 'j' || c == 'k' || c == 'l')
                    res += '5';
                else if(c == 'M' || c == 'N' || c == 'O' || c == 'm' || c == 'n' || c == 'o')
                    res += '6';
                else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'p' || c == 'q' || c == 'r' || c == 's')
                    res += '7';
                else if(c == 'T' || c == 'U' || c == 'V' || c == 't' || c == 'u' || c == 'v')
                    res += '8';
                else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z' || c == 'w' || c == 'x' || c == 'y'|| c == 'z')
                    res += '9';
            }
            if (check(res)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
