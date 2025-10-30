package code_ptit;
import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    String lp,ten;
    int gia;
    float pv;
    public LoaiPhong(String line){
        String[] s = line.trim().split("\\s+");
        this.lp = s[0];
        this.ten = s[1];
        this.gia = Integer.parseInt(s[2]);
        this.pv = Float.parseFloat(s[3]);
    }
    public int compareTo(LoaiPhong x){
        return this.ten.compareTo(x.ten);
    }
    @Override
    public String toString(){
        return lp + " " + ten + " " + gia + " " + pv;
    }
}
public class J07045_loaiphong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
