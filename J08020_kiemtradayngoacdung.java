package code_ptit;
import java.util.*;
public class J08020_kiemtradayngoacdung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            Stack<Character> st = new Stack<>();
            String s = sc.nextLine();
            boolean check = true;
            for(char c : s.toCharArray()){
                if(c == '(' || c == '{' || c == '[')
                    st.push(c);
                else{
                    if(st.isEmpty()){
                        check = false;
                        break;
                    }
                    char tmp = st.pop();
                    if((tmp != '(' && c == ')') || (tmp != '{' && c == '}') || (tmp != '[' && c == ']')){
                        check = false;
                        break;
                    }
                }
            }
            if(!st.isEmpty())
                check = false;
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
