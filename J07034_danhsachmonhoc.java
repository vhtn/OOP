package code_ptit;
import java.util.*;
import java.io.*;
class MonHoc{
    String ma, mon;
    int cnt;
    public MonHoc(String ma, String mon, int cnt){
        this.ma = ma;
        this.mon = mon;
        this.cnt = cnt;
    }
    @Override
    public String toString(){
        return ma + " " + mon + " " + cnt;
    }
}
class Sort implements Comparator<MonHoc>{
    public int compare(MonHoc a, MonHoc b){
        return a.mon.compareTo(b.mon);
    }
}
public class J07034_danhsachmonhoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String mon = sc.nextLine();
            int cnt = Integer.parseInt(sc.nextLine());
            MonHoc a = new MonHoc(ma, mon, cnt);
            mh.add(a);
        }
        Collections.sort(mh, new Sort());
        for(MonHoc it : mh)
            System.out.println(it);
    }
}
