package code_ptit;
import java.util.*;
import java.io.*;
class MonHoc{
    String ma, ten, lt, th;
    int tc;
    public MonHoc(String ma, String ten, int tc, String lt, String th){
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + tc + " " + lt + " " + th;
    }
}
class SortMH implements Comparator<MonHoc>{
    public int compare(MonHoc a, MonHoc b){      
        return a.ma.compareTo(b.ma);
    }
}
public class J07073_dangkyhinhthucgiangday {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc>ds = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine();
            String th = sc.nextLine();
            ds.add(new MonHoc(ma, ten, tc, lt, th));
        }
        Collections.sort(ds, new SortMH());
        for(MonHoc it : ds){
            if(it.th.equals("Truc tuyen") || it.th.endsWith(".ptit.edu.vn"))
                System.out.println(it);
        }
    }
}
