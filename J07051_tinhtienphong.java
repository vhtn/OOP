package code_ptit;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class KhachHang{
    String ten, sp, nhan, tra;
    int ma;
    long ps;
    public KhachHang(int ma, String ten, String sp, String nhan, String tra, long ps){
        this.ma = ma;
        this.ten = ten;
        this.sp = sp;
        this.nhan = nhan;
        this.tra = tra;
        this.ps = ps;
    }
    public String chuanHoaHoTen(){
        String res = "";
        String [] ht = ten.trim().toLowerCase().split("\\s+");
        for(String w : ht){
            w = w.substring(0,1).toUpperCase() + w.substring(1);
            res += w + " ";
        }
        return res.trim();
    }
    public String chuanHoaNgay(String s){
        int pos1 = s.indexOf('/');
        int pos2= s.lastIndexOf('/');
        String d = s.substring(0, pos1);
        String m = s.substring(pos1 + 1, pos2);
        String y = s.substring(pos2 + 1);
        if(d.length() == 1)
            d = "0" + d;
        if(m.length() == 1)
            m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    public long ngayO(){
        DateTimeFormatter dinhdang = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayNhan = LocalDate.parse(chuanHoaNgay(nhan).trim(), dinhdang);
        LocalDate ngayTra = LocalDate.parse(chuanHoaNgay(tra).trim(), dinhdang);
        return ChronoUnit.DAYS.between(ngayNhan, ngayTra) + 1;
    }
    public long thanhtien() {
        char tang = sp.charAt(0);
        long gia;
        if (tang == '1') gia = 25;
        else if (tang == '2') gia = 34;
        else if (tang == '3') gia = 50;
        else gia = 80;
        return gia * ngayO() + ps;
    }
    @Override
    public String toString(){
        return String.format("KH%02d", ma) + " " + chuanHoaHoTen() + " " + sp + " " + ngayO() + " " + thanhtien();
    }
}
class SortKH implements Comparator<KhachHang>{
    public int compare(KhachHang a, KhachHang b){
        return Long.compare(b.thanhtien(), a.thanhtien());
    }
}
public class J07051_tinhtienphong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String sp = sc.nextLine();
            String nhan = sc.nextLine();
            String tra = sc.nextLine();
            int ps = Integer.parseInt(sc.nextLine());
            kh.add(new KhachHang(i+1, ten, sp, nhan, tra, ps));
        }
        Collections.sort(kh, new SortKH());
        for(KhachHang it : kh){
            System.out.println(it);
        }
    }
}
