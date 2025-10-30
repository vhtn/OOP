package code_ptit;
import java.util.*;
public class J03040_biensodep {
    public static boolean check1(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if((s.charAt(i) - '0') >= (s.charAt(i+1) - '0'))
                return false;
        }
        return true;
    }
    public static boolean check3(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if((s.charAt(i) - '0') != (s.charAt(i+1) - '0'))
                return false;
        }
        return true;
    }
    public static boolean check4(String s){
        if((s.charAt(0) - '0') == (s.charAt(1) - '0') && (s.charAt(2) - '0') == (s.charAt(1) - '0') && (s.charAt(3) - '0') == (s.charAt(4) - '0'))
            return true;
        return false;
    }
    public static boolean check5(String s){
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') != 6 && (s.charAt(i) - '0') != 8)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            String res = "";
            for (int i = 5; i < s.length(); i++){
                if (s.charAt(i) != '.'){
                    res += s.charAt(i);
                }
            }
            if(check1(res) || check3(res) || check4(res) || check5(res)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
