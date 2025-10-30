package code_ptit;
import java.util.*;
import java.io.*;
class SinhVien{
    int ma;
    String ht, ns, lop;
    float gpa;
    public SinhVien(int ma, String ht, String ns, String lop, float gpa){
        this.ma = ma;
        this.ht = ht;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
    }
    public String getMa(){
        return "B20DCCN" + String.format("%03d", ma);
    }
    public String chuanhoa(){
        int pos1 = ns.indexOf("/");
        int pos2 = ns.lastIndexOf("/");
        String d = ns.substring(0, pos1);
        String m = ns.substring(pos1 + 1, pos2);
        String y = ns.substring(pos2 + 1);
        if(d.length() == 1) d = "0" + d;
        if(m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    @Override
    public String toString(){
        return getMa() + " " + ht + " " + lop + " " + chuanhoa() + " " + String.format("%.02f",gpa);
    }
}
public class J07010_danhsachsinhvientrongfile_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ht = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien a = new SinhVien(i + 1, ht, ns, lop, gpa);
            System.out.println(a);
        }
    }
}
