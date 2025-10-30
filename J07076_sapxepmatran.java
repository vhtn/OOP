package code_ptit;
import java.util.*;
import java.io.*;
public class J07076_sapxepmatran {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int a[][] = new int[n][m];
            for(int j = 0; j < n; j++)
                for(int k = 0; k < m; k++)
                    a[j][k] = sc.nextInt();
            int tmp[] = new int[n];
            for(int j = 0; j < n; j++){
                tmp[j] = a[j][i-1];
            }
            Arrays.sort(tmp);
            for(int j = 0; j < n; j++){
                a[j][i-1] = tmp[j];
            }
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    System.out.print(a[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
