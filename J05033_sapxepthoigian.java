package code_ptit;
import java.util.*;
class Time{
    int h, m, s;
    public Time(int h, int m, int s){
        this.h = h;
        this.m = m; 
        this.s = s;
    }
    @Override 
    public String toString(){
        return h + " " + m + " " + s;
    }
}
class Sort implements Comparator<Time>{
    public int compare(Time a, Time b){
        if(a.h != b.h) return a.h - b.h;
        if(a.m != b.m) return a.m - b.m;
        return a.s - b.s;
    }
}
public class J05033_sapxepthoigian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for(int i = 0; i < n; i++){
            times.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(times, new Sort());
        for(Time it : times){
            System.out.println(it);
        }
    }
}
