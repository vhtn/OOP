
package code_ptit;
import java.util.Scanner;
public class J01010_catdoi {
    private static String chiadoi(String s){
        String res = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '0' || c == '8' || c == '9'){
                    if(res.length() > 0)
                        res += '0';
                }
                else if(c == '1')
                    res += '1';
                else{
                    return "INVALID";
                }
            }
            if(res.length() == 0)
                return "INVALID";
            return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(chiadoi(s));
        }
    }
}
