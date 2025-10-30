package code_ptit;
import java.util.*;
public class J08015_capsocotongbangk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int cnt = 0;
            for(int i = 0; i < n - 1; i++){
                if(a[i] <= k)
                    for(int j = i + 1; j < n; j++){
                        if(a[i] + a[j] == k)
                            cnt++;
                    }
            }
            System.out.println(cnt);
        }
    }
}
