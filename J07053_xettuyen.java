package code_ptit;
import java.util.*;
import java.io.*;
class XetTuyen{
    int ma;
    String ht, ns;
    float lt, th;
    public XetTuyen(int ma, String ht, String ns, float lt, float th){
        this.ma = ma;
        this.ht = ht;
        this.ns = ns;
        this.lt = lt;
        this.th = th;
    }
    public String chuanHoa(){
        String res = "";
        String [] words = ht.trim().toLowerCase().split("\\s+");
        for(String w : words){
            res += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        }
        return res.trim();
    }
    public int tuoi(){
        int pos = ns.lastIndexOf('/');
        int y = Integer.parseInt(ns.substring(pos + 1));
        return 2021 - y;
    }
    public float diemThuong(){
        if(lt >= 8 && th >= 8)
            return 1f;
        else if(lt >= 7.5 && th >= 7.5)
            return 0.5f;
        return 0;
    }
    public int diemTB(){
        int res = Math.round((lt + th)/2 + diemThuong());
        if(res > 10)
            return 10;
        return res;
    }
    public String xepLoai(){
        int x = diemTB();
        if(x < 5)
            return "Truot";
        else if(5 <= x && x <= 6)
            return "Trung binh";
        else if(x == 7)
            return "Kha";
        else if(x == 8)
            return "Gioi";
        return "Xuat sac";
    }
    @Override
    public String toString(){
        return String.format("PH%02d", ma) + " " + chuanHoa() + " " + tuoi() + " " + diemTB() + " " + xepLoai();
    }
}
public class J07053_xettuyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String ht = sc.nextLine();
            String ns = sc.nextLine();
            float lt = Float.parseFloat(sc.nextLine());
            float th = Float.parseFloat(sc.nextLine());
            XetTuyen it = new XetTuyen(i + 1, ht, ns, lt, th);
            System.out.println(it);
        }
    }
}
