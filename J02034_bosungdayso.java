package code_ptit;
import java.util.*;
public class J02034_bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i = 1, j = 0;
        boolean check = true;
        while(i < a[n - 1]){
            if(i != a[j]){
                System.out.println(i);
                check = false;
            }
            else{
                j++;
            }
            i++;
        }
        if(check)
            System.out.println("Excellent!");
    }
}
