package code_ptit;
import java.util.*;
import java.io.*;
class KhachHang{
    String ht, loai;
    int ma, csd, csc, sd;
    public KhachHang(int ma, String ht, String loai, int csd, int csc){
        this.ma = ma;
        this.ht = ht;
        this.loai = loai;
        this.csd = csd;
        this.csc = csc;
    }
    public String chuanHoa(){
        String res = "";
        String[] word = ht.trim().toLowerCase().split("\\s+");
        for(String w : word){
            res += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
        }
        return res.trim();
    }
    public int dinhMuc(){
        if (loai.equals("A"))
            return 100;
        else if(loai.equals("B"))
            return 500;
        return 200;
    }
    public int tienTrongDM(){
        int sd = csc - csd;
        if(sd < dinhMuc())
            return sd * 450;
        return dinhMuc() * 450;
    }
    public int tienVuotDM(){
        int sd = csc - csd;
        if(sd > dinhMuc())
            return (sd - dinhMuc()) * 1000;
        return 0;
    }
    public int VAT(){
        return tienVuotDM()*5/100;
    }
    public int tong(){
        return tienTrongDM() + tienVuotDM() + VAT();
    }
    @Override
    public String toString(){
        return String.format("KH%02d", ma) + " " + chuanHoa() + " " + tienTrongDM() + " " + tienVuotDM() + " " + VAT() + " " + tong();
    }
}
class SortTD implements Comparator<KhachHang>{
    public int compare(KhachHang a, KhachHang b){
        return b.tong() - a.tong();
    }
}
public class J07056_tinhtiendien {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ht = sc.nextLine();
            String line = sc.nextLine();
            String[] arr = line.split("\\s+");
            String loai = arr[0];
            int csDau = Integer.parseInt(arr[1]);
            int csCuoi = Integer.parseInt(arr[2]);
            ds.add(new KhachHang(i + 1, ht, loai, csDau, csCuoi));
        }
        Collections.sort(ds, new SortTD());
        for(KhachHang it : ds)
            System.out.println(it);
    }
}
