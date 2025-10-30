package code_ptit;
import java.util.*;
import java.io.*;
import java.text.*;
class Online{
    String s;
    long t;
    public Online(String s, long t){
        this.s = s;
        this.t = t;
    }
    @Override
    public String toString(){
        return s + " " + t;
    }
}
class SortTime implements Comparator<Online>{
    public int compare(Online a, Online b){
        return Long.compare(b.t, a.t);
    }
}
public class J07084_thoigianonlinelientuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Online> ds = new ArrayList<>();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        while(n-- > 0){
            String s = sc.nextLine();
            Date bd = date.parse(sc.nextLine());
            Date kt = date.parse(sc.nextLine());
            long t = (kt.getTime() - bd.getTime())/60000;
            ds.add(new Online(s, t));
        }
        Collections.sort(ds, new SortTime());
        for(Online it : ds){
            System.out.println(it);
        }
    }
}
