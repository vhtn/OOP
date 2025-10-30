package code_ptit;
import java.util.*;
class Cong{
    private String ma, ten, cv;
    private int luongCb, ngayCong;
    public Cong(String ten, int luongCb, int ngayCong, String cv){
        this.ten = ten;
        this.luongCb = luongCb;
        this.ngayCong = ngayCong;
        this.cv = cv;
    }
    public int phuCap(){
        if("GD".equals(cv))
            return 250000;
        if("PGD".equals(cv))
            return 200000;
        if("TP".equals(cv))
            return 180000;
        if("NV".equals(cv))
            return 150000;
        return 0;
    }
    public int tienLuong(){
        return luongCb*ngayCong;
    }
    public int thuong(){
        if(ngayCong >= 25)
            return tienLuong()*20/100;
        if(ngayCong >= 22)
            return tienLuong()*10/100;
        return 0;
    }
    public int thuNhap(){
        return tienLuong() + thuong() + phuCap();
    }
    @Override
    public String toString(){
        return "NV01 " + ten + ' ' + tienLuong() + ' ' + thuong() + ' ' + phuCap() + ' ' + thuNhap();
    }
}
public class J04012_baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int cong = Integer.parseInt(sc.nextLine());
        String cv = sc.nextLine();
        Cong x = new Cong(ten, luong, cong, cv);
        System.out.println(x);
    }
    
}
