package code_ptit;
import java.util.*;
import java.io.*;
class DoanhNghiep{
    String ma, ten;
    int sv;
    public DoanhNghiep(String ma, String ten, int sv){
        this.ma = ma;
        this.ten = ten;
        this.sv = sv;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + sv;
    }
}
class SortDN implements Comparator<DoanhNghiep>{
    public int compare(DoanhNghiep a, DoanhNghiep b){
        return a.ma.compareTo(b.ma);
    }
}
public class J07037_danhsachdoanhnghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> dn = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sv = Integer.parseInt(sc.nextLine());
            DoanhNghiep a = new DoanhNghiep(ma, ten, sv);
            dn.add(a);
        }
        Collections.sort(dn, new SortDN());
        for(DoanhNghiep it : dn)
            System.out.println(it);
    }
}
