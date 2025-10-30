package code_ptit;
import java.util.*;
public class J08021_dayngoacdungdainhat {
    public static int max_len(String s){
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(i);
            else{
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else{
                    maxLen = Math.max(maxLen, i - st.peek());
                }         
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(max_len(s));
        }
    }
}
