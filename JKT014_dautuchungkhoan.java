package code_ptit;
import java.util.*;
public class JKT014_dautuchungkhoan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int res[] = new int[n];
            for(int i = 0; i < n; i++){
                res[i] = 1;
                while(!st.isEmpty() && a[st.peek()] <= a[i]){
                    res[i] += res[st.pop()];
                }
                st.push(i);
            }
            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
