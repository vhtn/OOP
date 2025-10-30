package code_ptit;
import java.util.*;
public class J03027_rutgonxaukytu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (st.isEmpty() || st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty())
            System.out.print("Empty String");
        else
            for (char c : st){
                System.out.print(c);
            }
    }
}
