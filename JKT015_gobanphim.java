package code_ptit;
import java.util.*;
public class JKT015_gobanphim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> l = new Stack<>();
        Stack<Character> r = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '<' && !l.isEmpty()){
                r.push(l.pop());
            }
            else if(c == '>' && !r.isEmpty()){
                l.push(r.pop());
            }
            else if(c == '-' && !l.isEmpty()){
                l.pop();
            }
            else if(c != '<' && c != '>' && c != '-')
                l.push(c);
        }
        for(Character x : l)
            System.out.print(x);
        while(!r.isEmpty())
            System.out.print(r.pop());
    }
}
