package code_ptit;
import java.util.*;
import java.io.*;
class SV{
    String ht;
    float a, b, c;
    int ma;
    public SV(int ma, String ht, float a, float b, float c){
        this.ma = ma;
        this.ht = ht;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String chuanHoa(){
        String res = "";
        String [] words = ht.trim().toLowerCase().split("\\s+");
        for(String w : words){
            res += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        }
        return res.trim();
    }
    public float diemTb(){
        return (a * 25 + b * 35 + c * 40) / 100;
    }
    public String xepLoai(){
        float tmp = diemTb();
        if(tmp >= 8)
            return "GIOI";
        else if(6.5 <= tmp)
            return "KHA";
        else if(5 <= tmp)
            return "TRUNG BINH";
        return "KEM";
    }
    @Override
    public String toString(){
        return String.format("SV%02d", ma) + " " + chuanHoa() + " " + String.format("%.2f",diemTb()) + " " + xepLoai();
    }
}
class SortTB implements Comparator<SV>{
    public int compare(SV x, SV y){
        return Float.compare(y.diemTb(),x.diemTb());
    }
}
public class J07055_xeploai {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ht = sc.nextLine();
            float a = Float.parseFloat(sc.nextLine());
            float b = Float.parseFloat(sc.nextLine());
            float c = Float.parseFloat(sc.nextLine());
            ds.add(new SV(i+1, ht, a, b, c));
        }
        Collections.sort(ds, new SortTB());
        for(SV it : ds)
            System.out.println(it);
    }
}
