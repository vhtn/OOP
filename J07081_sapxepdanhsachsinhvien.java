package code_ptit;
import java.util.*;
import java.io.*;
class SinhVien{
    String ma, ht, sdt, dc;
    public SinhVien(String ma, String ht, String sdt, String dc){
        this.ma = ma;
        this.ht = ht;
        this.sdt = sdt;
        this.dc = dc;
    }
    public String ten(){
        String[] s = ht.split("\\s+");
        return s[s.length - 1];
    }
    public String ho(){
        String[] s = ht.split("\\s+");
        return s[0];
    }
    public String dem(){
        String res = "";
        String[] s = ht.split("\\s+");
        for(int i = 1; i < s.length - 1; i++)
            res += s[i] + " ";
        return res.trim();
    }
    @Override
    public String toString(){
        return ma + " " + ht + " " + sdt + " " + dc;
    }
}
class SortSV implements Comparator<SinhVien>{
    public int compare(SinhVien a, SinhVien b){
        if(a.ten() == null ? b.ten() != null : !a.ten().equals(b.ten()))
            return a.ten().compareTo(b.ten());
        if(a.ho() == null ? b.ho() != null : !a.ho().equals(b.ho()))
            return a.ho().compareTo(b.ho());
        if(a.dem() == null ? b.dem() != null : !a.dem().equals(b.dem()))
            return a.dem().compareTo(b.dem());
        return a.ma.compareTo(b.ma);
    }
}
public class J07081_sapxepdanhsachsinhvien {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ht = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new SinhVien(ma, ht, sdt, email));
        }
        Collections.sort(ds, new SortSV());
        for(SinhVien it : ds)
            System.out.println(it);
    }
}
