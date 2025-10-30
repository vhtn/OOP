package code_ptit;
import java.util.*;
class SinhVien{
    private String ma, ht, lop, ns;
    private float gpa;
    public SinhVien(){
        this.ma = "B20DCCN001";
        this.ht = "";
        this.lop = "";
        this.ns = "";
        this.gpa = 0;
    }
    public void nhap(Scanner sc){
        this.ht = sc.nextLine();
        this.lop = sc.nextLine();
        this.ns = sc.nextLine();
        this.gpa = sc.nextFloat();
    }
    public String chuanhoa(){
        int pos1 = ns.indexOf('/');
        int pos2 = ns.lastIndexOf('/');
        String d = ns.substring(0, pos1);
        String m = ns.substring(pos1 + 1, pos2);
        String y = ns.substring(pos2 + 1);
        if (d.length() == 1) d = "0" + d;
        if (m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" +y;
    }
    @Override
    public String toString(){
        return ma + " " + ht + " " + lop + " " + chuanhoa() + " " + String.format("%.2f", gpa);
    }
}
public class J04006_khaibaolopsinhvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        a.nhap(sc);
        System.out.print(a);
    }
}
