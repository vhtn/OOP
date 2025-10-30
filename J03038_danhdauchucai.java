package code_ptit;
import java.util.*;
public class J03038_danhdauchucai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> res = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            res.add(s.charAt(i));
        }
        System.out.print(res.size());
    }
}
