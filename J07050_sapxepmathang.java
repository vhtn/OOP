package code_ptit;
import java.util.*;
import java.io.*;
class MatHang{
    String ten, nhom;
    int ma;
    double mua, ban;
    public MatHang(int ma, String ten, String nhom, double mua, double ban){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public double loinhuan(){
        return ban - mua;
    }
    @Override
    public String toString(){
        return String.format("MH%02d", ma) + " " + ten + " " + nhom + " " + String.format("%.2f",loinhuan());
    }
}
class SortMH implements Comparator<MatHang>{
    public int compare(MatHang a, MatHang b){
        return Double.compare(b.loinhuan(), a.loinhuan());
    }
}
public class J07050_sapxepmathang {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            Double mua = Double.parseDouble(sc.nextLine());
            Double ban = Double.parseDouble(sc.nextLine());
            mh.add(new MatHang(i + 1, ten, nhom, mua, ban));
        }
        Collections.sort(mh, new SortMH());
        for(MatHang it : mh){
            System.out.println(it);
        }
    }
}
