package code_ptit;
import java.util.*;
public class J03009_tapturiengcuahaixau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] tu1 = s1.split(" ");
            Set<String> tmp = new HashSet<>();
            for(String it : tu1){
                if(!s2.contains(it))
                    tmp.add(it);
            }
            for(String it : tmp){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
