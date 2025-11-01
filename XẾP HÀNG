package code_ptit;
import java.util.*;
class Time{
    int t, d;
    public Time(int t, int d){
        this.t = t;
        this.d = d;
    }
}
class SortTG implements Comparator<Time>{
    public int compare(Time a, Time b){
        return Integer.compare(a.t, b.t);
    }
}
public class J02009_xephang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> ds = new ArrayList<>();
        while(n-- > 0){
            int t = sc.nextInt();
            int d = sc.nextInt();
            ds.add(new Time(t, d));
        }
        Collections.sort(ds, new SortTG());
        int res = 0;
        for(Time it : ds){
            if(res <= it.t)
                res = it.t + it.d;
            else 
                res += it.d;
        }
        System.out.print(res);
    }
}
