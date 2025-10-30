package code_ptit;
import java.util.*;
public class J02035_quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int res = 0;
            for(int i = n-1; i > 0; i--){
                if(a[i] < a[i-1]){
                    res = i;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
