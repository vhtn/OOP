package code_ptit;
import java.util.*;
import java.io.*;
class KhachHang{
    private static int cnt = 1;
    private String ma, ten, gt, ns, dc;
    public KhachHang(String ten, String gt, String ns, String dc){
        this.ma = String.format("KH%03d", cnt++);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getDc(){
        return dc;
    }
}
class MatHang{
    private static int cnt = 1;
    private String ma, ten, dv;
    private int mua, ban;
    public MatHang(String ten, String dv, int mua, int ban){
        this.ma = String.format("MH%03d", cnt++);
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getDv(){
        return dv;
    }
    public int getMua(){
        return mua;
    }
    public int getBan(){
        return ban;
    }
}
class HoaDon{
    private static int cnt = 1;
    private String maHD;
    private KhachHang kh;
    private MatHang mh;
    private int sl;
    public HoaDon(KhachHang kh, MatHang mh, int sl){
        this.maHD = String.format("HD%03d", cnt++);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }
    @Override
    public String toString(){
        int tt = mh.getBan() * sl;
        return maHD + " " + kh.getTen() + " " + kh.getDc() + " " + mh.getTen() + " " + mh.getDv() + " " + mh.getMua() + " " + mh.getBan() + " " + sl + " " + tt;
    }
}
public class J06009_baitoanbanhang {
    public static void main(String[] args) throws Exception{
        Scanner scKH = new Scanner(new File ("KH.in"));
        int n = Integer.parseInt(scKH.nextLine());
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = scKH.nextLine().trim();
            String gt = scKH.nextLine().trim();
            String ns = scKH.nextLine().trim();
            String dc = scKH.nextLine().trim();
            dsKH.add(new KhachHang(ten, gt, ns, dc));
        }
        Scanner scMH = new Scanner(new File ("MH.in"));
        int m = Integer.parseInt(scMH.nextLine());
        ArrayList<MatHang> dsMH = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ten = scMH.nextLine().trim();
            String dv = scMH.nextLine().trim();
            int gm = Integer.parseInt(scMH.nextLine().trim());
            int gb = Integer.parseInt(scMH.nextLine().trim());
            dsMH.add(new MatHang(ten, dv, gm, gb));
        }
        Scanner scHD = new Scanner(new File ("HD.in"));
        int k = Integer.parseInt(scHD.nextLine());
        ArrayList<HoaDon> dsHD = new ArrayList<>();
        for(int i = 0; i < k; i++){
            String[] a = scHD.nextLine().split("\\s+");
            String maKH = a[0];
            String maMH = a[1];
            int sl = Integer.parseInt(a[2]);
            KhachHang kh = null;
            for(KhachHang x : dsKH){
                if(x.getMa().equals(maKH)){
                    kh = x;
                    break;
                }
            }
            MatHang mh = null;
            for(MatHang x : dsMH){
                if(x.getMa().equals(maMH)){
                    mh = x;
                    break;
                }
            }
            if(maKH != null && maMH != null){
                dsHD.add(new HoaDon(kh, mh, sl));
            }
        }
        for(HoaDon x : dsHD)
                System.out.println(x);
    }
}
