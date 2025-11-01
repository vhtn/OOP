package code_ptit;
import java.util.*;
public class J02014_diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int res = -1;
            int tong = 0;
            for(int i = 0; i < n; i++){
                if(tong == sum - a[i]){
                    res = i+1;
                    break;
                }
                else{
                    tong += a[i];
                    sum -= a[i];
                }
            }
            System.out.println(res);
        }
    }
}
