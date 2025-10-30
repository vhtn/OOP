package code_ptit;
import java.util.*;
import java.io.*;
class ThiSinh{
    int ma, kv;
    String ht, dt;
    float diem; 
    public ThiSinh(int ma, String ht, float diem, String dt, int kv){
        this.ma = ma;
        this.ht = ht;
        this.diem = diem;
        this.dt = dt;
        this.kv= kv;
    }
    public String chuanHoa(){
        String res = "";
        String[] word = ht.trim().toLowerCase().split("\\s+");
        for(String w : word)
            res += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        return res.trim();
    }
    public float UTKV(){
        if(kv == 1)
            return 1.5f;
        else if(kv == 2)
            return 1f;
        return 0f;
    }
    public float UTDT(){
        if(dt.equals("Kinh"))
            return 0f;
        return 1.5f;
    }
    public float tong(){
        return diem + UTKV() + UTDT();
    }
    public String trangThai(){
        if(tong() >= 20.5)
            return "DO";
        return "TRUOT";
    }
    @Override
    public String toString(){
        return String.format("TS%02d", ma) + " " + chuanHoa() + " " + String.format("%.1f",tong()) + " " + trangThai();
    }
}
class SortDiem implements Comparator<ThiSinh>{
    public int compare(ThiSinh a, ThiSinh b){
        if(a.tong() != b.tong())
            return Float.compare(b.tong(), a.tong());
        return a.ma - b.ma;
    }
}
public class J07057_diemtuyensinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ht = sc.nextLine();
            float diem = Float.parseFloat(sc.nextLine());
            String dt = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            ds.add(new ThiSinh(i + 1, ht, diem, dt, kv));
        }
        Collections.sort(ds, new SortDiem());
        for(ThiSinh it : ds)
            System.out.println(it);
    }
}
