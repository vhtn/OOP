package code_ptit;
import java.util.*;
class TuyenSinh{
    private String ma, ht;
    private double toan, ly, hoa;
    public TuyenSinh(String ma, String ht, double toan, double ly, double hoa){
        this.ma = ma;
        this.ht = ht;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double diemUuTien(){
        String kv = ma.substring(0,3);
        if(kv.equals("KV1"))
            return 0.5;
        if(kv.equals("KV2"))
            return (int)1;
        if(kv.equals("KV3"))
            return 2.5;
        return 0;
    }
    public double tongDiem(){
        return toan*2 + hoa + ly;
    }
    public String trangThai(){
        if(tongDiem() + diemUuTien() < 24)
            return "TRUOT";
        return "TRUNG TUYEN";
    }
    public String formatDiem(double x){
        if(x == (int)x)
            return String.valueOf((int)x);
        return String.format("%.1f", x);
    }
    @Override
    public String toString(){
        return ma + ' ' + ht + ' ' + formatDiem(diemUuTien()) + ' ' + formatDiem(tongDiem()) + ' ' + trangThai();
    }
}
public class J04013_baitoantuyensinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ht = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        TuyenSinh ts = new TuyenSinh(ma, ht, toan, ly, hoa);
        System.out.println(ts);
    }
}
