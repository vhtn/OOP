package code_ptit;
import java.util.*;
class GiaoVien{
    private String ma, ht;
    private int bac, luong, pc, tn;
    public GiaoVien(String ma, String ht, int luong){
        this.ma = ma;
        this.ht = ht;
        this.luong = luong;
        this.bac = 0;
        this.pc = 0;
        this.tn = 0;
    }
    public void tinh(){
        bac = (ma.charAt(2) - '0') * 10 + (ma.charAt(3) - '0');
        String cv = ma.substring(0, 2);
        if(cv.equals("HT")){
            pc = 2000000;
        }
        else if(cv.equals("HP")){
            pc = 900000;
        }
        else if(cv.equals("GV")){
            pc = 500000;
        }
        tn = luong * bac + pc;
    }
    @Override
    public String toString(){
        return ma + " " + ht + " " + bac + " " + pc + " " + tn;
    }
}
public class J04015_tinhthunhapgiaovien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ht = sc.nextLine();
        int luong = sc.nextInt();
        GiaoVien a = new GiaoVien(ma, ht, luong);
        a.tinh();
        System.out.println(a);
    }
}
