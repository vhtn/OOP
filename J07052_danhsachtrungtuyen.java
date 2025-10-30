package code_ptit;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class ThiSinh{
    String ma, ht;
    float toan, ly, hoa;
    public ThiSinh(String ma, String ht, float toan, float ly, float hoa){
        this.ma = ma;
        this.ht = ht;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public float uutien(){
        String s = ma.substring(0, 3);
        if(s.equals("KV1"))
            return 0.5f;
        else if(s.equals("KV2"))
            return 1.0f;
        return 2.5f;
    }
    public float diem(){
        return toan * 2 + ly + hoa + uutien();
    }
    public String chuanHoa(){
        String res = "";
        String [] word = ht.trim().toLowerCase().split("\\s+");
        for(String w : word){
            res += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        }
        return res.trim();
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        return ma + " " + chuanHoa() + " " + df.format(uutien()) + " " + df.format(diem()) + " ";
    }
}
class SortDT implements Comparator<ThiSinh>{
    public int compare(ThiSinh a, ThiSinh b){
        if(a.diem() != b.diem())
            return Float.compare(b.diem(),a.diem());
        return a.ma.compareTo(b.ma);
    }
}
public class J07052_danhsachtrungtuyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while(n-- > 0){
            String ma= sc.nextLine();
            String ten = sc.nextLine();
            float toan = Float.parseFloat(sc.nextLine());
            float ly = Float.parseFloat(sc.nextLine());
            float hoa = Float.parseFloat(sc.nextLine());
            ts.add(new ThiSinh(ma, ten, toan, ly, hoa));
        }
        Collections.sort(ts, new SortDT());
        int chiTieu = sc.nextInt();
        float diemChuan = ts.get(chiTieu - 1).diem();
        System.out.println(diemChuan);
        for(ThiSinh it : ts){
            System.out.print(it);
            if(it.diem() >= diemChuan)
                System.out.println("TRUNG TUYEN");
            else
                System.out.println("TRUOT");
        }
    }
}
