package code_ptit;
import java.util.*;
import java.io.*;
class CaThi{
    int ma;
    String nt, gt, pt;
    int d, M, y, h, m;
    public CaThi(int ma, String nt, String gt, String pt){
        this.ma = ma;
        this.nt = nt;
        this.gt = gt;
        this.pt = pt;
        this.gioThi();
    }
    public void gioThi(){
        int pos = gt.indexOf(':');
        h = Integer.parseInt(gt.substring(0, pos));
        m = Integer.parseInt(gt.substring(pos + 1));
        int pos1 = nt.indexOf('/');
        int pos2 = nt.lastIndexOf('/');
        d = Integer.parseInt(nt.substring(0, pos1));
        M = Integer.parseInt(nt.substring(pos1 + 1, pos2));
        y = Integer.parseInt(nt.substring(pos2 + 1));
    }
    @Override
    public String toString(){
        return String.format("C%03d", ma) + " " + nt + " " + gt + " " + pt;
    }
}
class SortCT implements Comparator<CaThi>{
    public int compare(CaThi a, CaThi b){
        if(a.y != b.y)
            return a.y - b.y;
        if(a.M != b.M)
            return a.M - b.M;
        if(a.d != b.d)
            return a.d - b.d;
        if(a.h != b.h)
            return a.h - b.h;
        if(a.m != b.m)
            return a.m - b.m;
        return a.ma - b.ma;
    }
}
public class J07059_danhsachcathi {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String nt = sc.nextLine();
            String gt = sc.nextLine();
            String pt = sc.nextLine();
            ds.add(new CaThi(i + 1, nt, gt, pt));
        }
        Collections.sort(ds, new SortCT());
        for(CaThi it : ds)
            System.out.println(it);
    }
}
