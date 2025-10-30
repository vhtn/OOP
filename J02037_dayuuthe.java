package code_ptit;
import java.util.*;
public class J02037_dayuuthe {
    public static boolean check(ArrayList<Integer> a){
        int cnt = 0;
        int n = a.size();
        for(int i = 0; i < n; i++){
            if(a.get(i) % 2 == 0)
                cnt++;
        }
        if(n % 2 == 0 && cnt > n - cnt)
           return true;
        if(n % 2 == 1 && cnt < n - cnt)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String [] tmp = s.split("\\s+");
            ArrayList<Integer> ds = new ArrayList<>();
            for(String i : tmp){
                ds.add(Integer.parseInt(i));
            }
            if(check(ds))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
