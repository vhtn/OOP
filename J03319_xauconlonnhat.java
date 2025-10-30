package code_ptit;
import java.util.*;
public class J03319_xauconlonnhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int i = 1;
        st.push(s.charAt(0));
        while(i < s.length()){
            char c = st.peek();
            if(c <= s.charAt(i)){
                st.pop();
            }
            st.push(s.charAt(i));
            i++;
        }
        
    }
}
