package code_ptit;
import java.util.Scanner;
public class J01005_chiatamgiac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            double s = (0.5 * 1 * h) / n;
            for(int i = 1; i < n; i++){
                System.out.print(String.format("%.6f ",Math.sqrt(2 * s * i * h)));
            }
            System.out.println();
        }
    }
}
