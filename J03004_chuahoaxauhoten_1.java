package code_ptit;
import java.util.*;
public class J03004_chuahoaxauhoten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] ten = s.trim().split("\\s+");
            for(String w : ten){
                System.out.print(w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ");
            }
            System.out.println();
        }
    }
}
