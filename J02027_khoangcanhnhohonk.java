package code_ptit;
import java.util.*;
public class J02027_khoangcanhnhohonk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n ; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int cnt = 0;
            for(int i = 0; i < n; i++){
                int it = Arrays.binarySearch(a, i + 1, n, a[i] + k);
                if(it < 0){
                    it = -it - 1;
                }
                cnt += it - (i + 1);
            }
            System.out.println(cnt);
        }
    }
}
