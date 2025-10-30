package code_ptit;
import java.util.*;
public class J02103_tichmatranvoichuyenvicuano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x <= t; x++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] res = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int sum = 0;
                    for(int k = 0; k < m; k++)
                        sum += a[i][k] * a[j][k];
                    res[i][j] = sum;
                }
            }
            System.out.println("Test " + x + ":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
