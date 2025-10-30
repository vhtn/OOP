package code_ptit;
import java.util.*;
import java.io.*;
class MonHoc{
    String ma, ten, ht;
    public MonHoc(String ma, String ten, String ht){
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + ht;
    }
}
class SortMH implements Comparator<MonHoc>{
    public int compare(MonHoc a, MonHoc b){
        return a.ma.compareTo(b.ma);
    }
}
public class J07058_dachsachmonthi {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ht = sc.nextLine();
            ds.add(new MonHoc(ma, ten, ht));
        }
        Collections.sort(ds, new SortMH());
        for(MonHoc it : ds)
            System.out.println(it);
    }
}
