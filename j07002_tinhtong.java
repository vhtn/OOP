package code_ptit;
import java.util.*;
import java.io.*;
public class j07002_tinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\DATA.in"));
        long s = 0;
        while(sc.hasNext()){
            if(sc.hasNextInt())
                s += sc.nextInt();
            else
                sc.next();
        }
        sc.close();
        System.out.println(s);
    }
}
