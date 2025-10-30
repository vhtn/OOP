package code_ptit;
import java.util.*;
public class J03005_chuanhoahoten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] ten = s.trim().split("\\s+");
            String firstName = ten[0].toUpperCase();
            for(int i =1; i < ten.length; i++){
                System.out.print(ten[i].substring(0, 1).toUpperCase() + ten[i].substring(1).toLowerCase());
                if(i < ten.length- 1){
                    System.out.print(" ");
                }
            }
            System.out.println(", " + firstName);
        }
    }
}
