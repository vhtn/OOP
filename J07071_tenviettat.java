package code_ptit;
import java.util.*;
import java.io.*;
class VietTat{
    String ten;
    public VietTat(String ten){
        this.ten = ten;
    }
    public String tenTat(){
        String res = "";
        String[] w = ten.split("\\s+");
        for(int i = 0; i < w.length; i++){
            res += Character.toUpperCase(w[i].charAt(0));
            if(i < w.length - 1)
                res += ".";
        }
        return res;
    }
    public String Ten(){
        String[] w = ten.split("\\s+");
        return w[w.length - 1];
    }
    public String Ho(){
        String[] w = ten.split("\\s+");
        return w[0];
    }
}
class SortTen implements Comparator<VietTat>{
    public int compare(VietTat a, VietTat b){
        if(a.Ten() != b.Ten())
            return a.Ten().compareTo(b.Ten());
        return a.Ho().compareTo(b.Ho());
    }
}
public class J07071_tenviettat {
    public static boolean check(String tmp, String s){
        if(tmp.length() != s.length())
            return false;
        boolean ok = false;
        for(int i = 0; i < s.length(); i++){
            if(tmp.charAt(i) == '*'){
                if(ok)
                    return false;
                ok = true;
                continue;
            }
            if(tmp.charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] ags) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VietTat> ds = new ArrayList<>();
        while(n-- > 0){
            String ten = sc.nextLine();
            ds.add(new VietTat(ten));
        }
        int k = Integer.parseInt(sc.nextLine());
        while(k-- > 0){
            String tmp = sc.nextLine();
            ArrayList<VietTat> res = new ArrayList<>();
            for(VietTat it : ds)
                if(check(tmp, it.tenTat()))
                    res.add(it);
            Collections.sort(res, new SortTen());
            for(VietTat it : res)
                System.out.println(it.ten);
        }
    }
}
