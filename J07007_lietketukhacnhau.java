package code_ptit;
import java.util.*;
import java.io.*;
public class J07007_lietketukhacnhau {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\VANBAN.in"));
        TreeSet<String> word = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            word.add(s.toLowerCase());
        }
        for(String w  :word){
            System.out.println(w);
        }
    } 
}
