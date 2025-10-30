package code_ptit;
import java.util.*;
import java.io.*;
class SinhVien{
    String ma, ht, lop, email;
    public SinhVien(String ma, String ht, String lop, String email){
        this.ma = ma;
        this.ht = ht;
        this.lop = lop;
        this.email = email;
    }
    public String chuanhoa(){
        StringBuilder res = new StringBuilder();
        String[] w = ht.trim().toLowerCase().split("\\s+");
        for(String it : w){
            res.append(it.substring(0,1).toUpperCase()).append(it.substring(1)).append(" ");
        }   
        return res.toString().trim();
    }
    /*
    public String chuanhoa(){
        String res = "";
        String[] w = ht.trim().toLowerCase().split("\\s+");
        for(String it : w){
            res += it.substring(0,1).toUpperCase() + it.substring(1) + " ";
        }   
        return res.trim();
    }
    */
    @Override 
    public String toString(){
        return ma + " " + chuanhoa() + " " + lop + " " + email;
    }
}
class Sort implements Comparator<SinhVien>{
    public int compare(SinhVien a, SinhVien b){
        return a.ma.compareTo(b.ma);
    }
}
public class J07033_danhsachsinhvientrongfile_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> s = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            String ma = sc.nextLine();
            String ht = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien a = new SinhVien(ma, ht, lop, email);
            s.add(a);
        }
        Collections.sort(s, new Sort());
        for(SinhVien it : s)
            System.out.println(it);
    }
}
