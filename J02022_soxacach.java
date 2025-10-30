package code_ptit;
import java.util.*;
public class J02022_soxacach {
    public static boolean [] check = new boolean[10];
    public static int cnt;
    public static void kt(int[] a, int n){
        for(int i = 1; i < n; i++){
            if(Math.abs(a[i] - a[i+1]) == 1)
                return;
        }
        for(int i = 1; i <= n; i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void Try(int[] a, int i, int n){
        for(int j = 1; j <=n; j++){
            if(!check[j]){
                a[i] = j;
                check[j] = true;
                if(i == n)
                   kt(a, n);
                else
                   Try(a, i + 1, n);
                check[j] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n+1];
            Try(a, 1, n);
            System.out.println();
        }
    }

}
