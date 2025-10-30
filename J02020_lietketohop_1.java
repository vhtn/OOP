package code_ptit;
import java.util.*;
public class J02020_lietketohop_1 {
    private static boolean sinhToHop(int k, int n, int x[]){
        int i = k;
        while(x[i] == n - k + i){
                i--;
            }
        if(i < 1) return false;
            x[i]++;
            for(int j = i + 1; j <= k; j++){
                x[j] = x[j-1] + 1;
            }
            return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[k+1];
        for(int i = 1; i <= k; i++){
            x[i] = i;
        }
        int cnt = 0;
        while(true){
            for(int j = 1; j <= k; j++)
                System.out.print(x[j] + " ");
            System.out.println();
            cnt++;
            if(!sinhToHop(k, n, x))
                break;
        }
        System.out.print("Tong cong co " + cnt + " to hop");
    }
}
