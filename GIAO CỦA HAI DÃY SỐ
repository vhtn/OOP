package code_ptit;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class J02005_giaocuahaidayso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> hop = new TreeSet<>();
        Set<Integer> giao = new TreeSet<>();
        while(n-- > 0){
            int x = sc.nextInt();
            hop.add(x);
        }    
        while(m-- > 0){
            int x = sc.nextInt();
            if(hop.contains(x))
                giao.add(x);
        }
        for(int it : giao)
            System.out.print(it + " ");
    }
}
