package code_ptit;
import java.util.*;
public class J02102_matranxoanoctangdan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        for(int i = 0; i < n * n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int h1 = 0, h2 = n, c1 = 0, c2 = n;
        int cnt = 0;
        int [][] res = new int[n][n];
        while(h1 < h2 && c1 < c2){
            for(int i = c1; i < c2; i++){
                res[h1][i] = a[cnt++];
            }
            h1++;
            for(int i = h1; i < h2; i++){
                res[i][c2 - 1] = a[cnt++];
            }
            c2--;
            if(h1 < h2){
                for(int i = c2 - 1; i >= c1; i--){
                    res[h2 - 1][i] = a[cnt++];
                }
                h2--;
            }
            if (c1 < c2) {
                for (int i = h2 - 1; i >= h1; i--)
                    res[i][c1] = a[cnt++];
                c1++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
