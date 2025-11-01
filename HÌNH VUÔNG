package code_ptit;
import java.util.Arrays;
import java.util.Scanner;
public class J01025_hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i = 0; i < 4; i++){
            int a = sc.nextInt();
            x[i] = a;
            int b = sc.nextInt();
            y[i] = b;
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int res = Math.max(Math.abs(x[3] - x[0]),Math.abs(y[3] - y[0]));
        System.out.println((long) res * res);
    }
}
