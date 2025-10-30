package code_ptit;
import java.util.*;
public class J02016_bobasopytago {
    public static boolean check(long a[], int n){
        for(int k = n-1; k > 1; k--){
            int i = 0, j = k - 1;
            while(i < j){
                if(a[i] + a[j] == a[k])
                    return true;
                else if(a[i] + a[j] < a[k])
                    i++;
                else
                    j--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n ; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long b[] = new long[n];
            for(int i = 0; i < n; i++){
                b[i] = 1L * a[i] * a[i];
            }
            if(check(b, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
