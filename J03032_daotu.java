package code_ptit;
import java.util.*;
public class J03032_daotu {
    public static String dao(String s){
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--){
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] w = s.split("\\s+");
            for (String x : w){
                System.out.print(dao(x) + " ");
            }
            System.out.println();
        }
    }
}
