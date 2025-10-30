package code_ptit;
import java.util.*;
class NhanVien{
    private String ma, ht, gt, ns, dc, mst, nk;
    public NhanVien(){
        this.ma = "00001";
        this.ht = "";
        this.gt = "";
        this.ns = "";
        this.dc = "";
        this.mst = "";
        this.nk = "";
    }
    public void nhap(Scanner sc){
        this.ht = sc.nextLine();
        this.gt = sc.nextLine();
        this.ns = sc.nextLine();
        this.dc = sc.nextLine();
        this.mst = sc.nextLine();
        this.nk = sc.nextLine();
    }
    @Override
    public String toString(){
        return ma + " " + ht + " " + gt + " " + ns +  " " + dc +  " " + mst + " " + nk;
    }
}
public class J04007_khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien();
        a.nhap(sc);
        System.out.print(a);
    }
}
