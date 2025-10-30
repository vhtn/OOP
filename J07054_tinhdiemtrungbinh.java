package code_ptit;
import java.util.*;
import java.io.*;
class SV{
    String ht;
    int ma;
    float x, y, z;
    int rank;
    public SV(int ma, String ht, float x, float y, float z){
        this.ma = ma;
        this.ht = ht;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String chuanHoa(){
        String res = "";
        String[] word = ht.trim().toLowerCase().split("\\s+");
        for(String w : word)
            res += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        return res.trim();
    }
    public float diemTB(){
        return(x * 3 + y * 3 + z * 2)/8;
    }
    @Override
    public String toString(){
        return String.format("SV%02d", ma) + " " + chuanHoa() + " " + String.format("%.2f", diemTB()) + " " + rank;
    }
}
class SortDiem implements Comparator<SV>{
    public int compare(SV a, SV b){
        if(a.diemTB() != b.diemTB())
            return Float.compare(b.diemTB(),a.diemTB());
        return a.ma - b.ma;
    }
}
public class J07054_tinhdiemtrungbinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ht = sc.nextLine();
            float x = Float.parseFloat(sc.nextLine());
            float y = Float.parseFloat(sc.nextLine());
            float z = Float.parseFloat(sc.nextLine());
            ds.add(new SV(i  +1, ht, x, y, z));
        }
        Collections.sort(ds, new SortDiem());
        ds.get(0).rank = 1;
        for(int i = 1; i < n; i++)
            if(Math.abs(ds.get(i).diemTB() - ds.get(i-1).diemTB()) < 1e-6)
                ds.get(i).rank = ds.get(i-1).rank;
            else
                ds.get(i).rank = i + 1;
        for(SV it : ds)
            System.out.println(it);
    }
}
