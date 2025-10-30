package code_ptit;
import java.util.*;
public class JK013_solocphat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            ArrayList<String> res = new ArrayList<>();
            q.offer("6");
            q.offer("8");
            while(!q.isEmpty()){
                String s = q.poll();
                if(s.length() > n) break;
                res.add(s);
                q.offer(s + "6");
                q.offer(s + "8");
            }
            Collections.reverse(res);
            System.out.println(res.size());
            for(String it : res)
                System.out.print(it + " ");
            System.out.println();
        }
    }
}
