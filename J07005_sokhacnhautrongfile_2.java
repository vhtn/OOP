package code_ptit;
import java.io.*;
import java.util.HashMap;
public class J07005_sokhacnhautrongfile_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\DATA.in"));
        HashMap<Integer, Integer> mp = new HashMap<>();
        while(dis.available() > 0){
            int x = dis.readInt();
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(Integer it : mp.keySet()){
            System.out.println(it + " " + mp.get(it));
        }
    }
}
