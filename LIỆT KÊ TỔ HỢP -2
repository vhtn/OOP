package code_ptit;
import java.util.*;
public class J02021_lietketohop_2 {
    private static boolean sinhToHop(int n, int k, int x[]){
        int i = k;
        while(x[i] == n-k+i) i--;
        if(i < 1) return false;
        x[i]++;
        for(int j = i + 1; j <=k ; j++)
            x[j] = x[j-1] + 1;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] x = new int[k+1];
        for(int i = 1; i <= k;i++){
            x[i] = i;
        }
        int cnt = 0;
        while(true){
            for(int i = 1; i <= k; i++)
                System.out.print(x[i]);
            System.out.print(" ");
            cnt++;
            if(!sinhToHop(n, k, x)){
                System.out.println();
                break;
            }
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
