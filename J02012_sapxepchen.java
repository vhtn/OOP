package code_ptit;
import java.util.*;
public class J02012_sapxepchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;  i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(a[i] < a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k <= i; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
