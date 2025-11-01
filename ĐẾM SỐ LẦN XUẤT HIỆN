package code_ptit;
import java.util.*;
public class J02007_demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            Map<Integer, Integer> mp = new LinkedHashMap<>();
            while(n-- > 0){
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + i + ":");
            for(Map.Entry<Integer, Integer> it: mp.entrySet()){
                System.out.println(it.getKey() + " xuat hien " + it.getValue() + " lan");
            }
        }
    }
}
