package code_ptit;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class Khach{
    String ten, phong, den, di;
    int ma;
    public Khach(int ma, String ten, String phong, String den, String di){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.den = den;
        this.di = di;
    }
    public long luutru(){
        DateTimeFormatter dinhdang = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayDen = LocalDate.parse(den, dinhdang);
        LocalDate ngayDi = LocalDate.parse(di, dinhdang);
        return ChronoUnit.DAYS.between(ngayDen, ngayDi);
    }
    @Override
    public String toString(){
        return String.format("KH%02d", ma) + " " + ten + " " + phong + " " + luutru();
    }
}
class SortLT implements Comparator<Khach>{
    public int compare(Khach a, Khach b){
        return Long.compare(b.luutru(), a.luutru());
    }
}
public class J07046_danhsachluutru {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACh.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> kh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            Khach a = new Khach(i + 1, ten, phong, den, di);
            kh.add(a);
        }
        Collections.sort(kh, new SortLT());
        for(Khach it : kh){
            System.out.println(it);
        }
    }
}
