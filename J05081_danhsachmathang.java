package code_ptit;
import java.util.*;
class MatHang{
    int ma, mua, ban;
    String ten, dv;
    public MatHang(int ma, String ten, String dv, int mua, int ban){
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa(){
        return "MH" + String.format("%03d", ma);
    }
    public int loinhuan(){
        return this.ban - this.mua;
    }
    @Override
    public String toString(){
        return getMa() + " " + ten + " " + dv + " " + mua + " " + ban + " " + loinhuan();
    }
}
class Sort implements Comparator<MatHang>{
    public int compare(MatHang a, MatHang b){
        if (a.loinhuan() != b.loinhuan())
            return b.loinhuan() - a.loinhuan();
        return a.ma - b.ma;
    }
}
public class J05081_danhsachmathang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());
            MatHang x = new MatHang(i+1, ten, dv, mua, ban);
            mh.add(x);
        }
        Collections.sort(mh, new Sort());
        for(MatHang it : mh){
            System.out.println(it);
        }
    }
}
