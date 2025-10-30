package code_ptit;
import java.util.*;
public class J03010_diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> mp = new HashMap<>();
        while(t-- > 0){
            String name = sc.nextLine().trim().toLowerCase();
            String[] s = name.split("\\s+");
            String ten = s[s.length - 1];
            for(int i = 0; i < s.length - 1; i++){
                ten += s[i].charAt(0);
            }
            if(!mp.containsKey(ten)){
                mp.put(ten,1);
                System.out.println(ten + "@ptit.edu.vn");
            }
            else{
                int cnt = mp.get(ten);
                System.out.println(ten + (cnt + 1) + "@ptit.edu.vn");
                mp.put(ten, cnt + 1);
            }
        }
    }
}
