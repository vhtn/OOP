package code_ptit;
import java.util.*;
public class J08012_hinhsao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int deg[] = new int[n+1];
        for(int i = 1; i < n; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            deg[u]++;
            deg[v]++;
        }
        int cnt = 0;
        boolean check = true;
        for(int i = 1; i < n; i++)
            if (deg[i] == n-1)
                cnt++;
            else if(deg[i] != 1){
                check = false;
                break;
            }
        if(cnt == 1 && check)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}
