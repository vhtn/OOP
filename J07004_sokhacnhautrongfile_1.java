package code_ptit;
import java.util.*;
import java.io.*;
public class J07004_sokhacnhautrongfile_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        HashMap<Integer, Integer> fre = new HashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            fre.put(x, fre.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it: fre.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}
