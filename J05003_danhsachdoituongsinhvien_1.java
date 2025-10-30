package code_ptit;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
class SinhVien{
    private static int cnt = 1;
    private String ma, ht, lop, ns;
    private double gpa;
    public SinhVien(String ht, String lop, String ns, double gpa){
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ht = ht;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public LocalDate chuanHoa(){
        DateTimeFormatter dinhdang = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(ns, dinhdang);
    }
    @Override
    public String toString(){
        return ma + " " + ht + " " + lop + " " + chuanHoa() + " " + String.format("%.2f", gpa);
    }
}
public class J05003_danhsachdoituongsinhvien_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String ht = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVen sv = new SinhVien(ht,lop, ns, gpa);
            System.out.println(sv);
        }
    }
}
