package code_ptit;
import java.util.*;
public class J08024_so0vaso9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.offer("9");
            int tmp = 9;
            while(tmp % n != 0){
                String s = q.poll();
                tmp = Integer.parseInt(s);
                q.offer(s + "0");
                q.offer(s + "9");
            }
            System.out.println(tmp);
        }
    }
}
