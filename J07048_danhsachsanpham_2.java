package code_ptit;
import java.util.*;
import java.io.*;
class SanPham{
    String ma, ten;
    int gia, bh;
    public SanPham(String ma, String ten, int gia, int bh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + gia + " " + bh;
    }
}
class SortSP implements Comparator<SanPham>{
    public int compare(SanPham a, SanPham b){
        if(a.gia != b.gia)
            return b.gia - a.gia;
        return a.ma.compareTo(b.ma);
    }
}
public class J07048_danhsachsanpham_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            sp.add(new SanPham(ma, ten, gia, bh));
        }
        Collections.sort(sp, new SortSP());
        for(SanPham it : sp)
            System.out.println(it);
    }
}
