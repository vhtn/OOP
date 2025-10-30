package code_ptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07001_docfilevanban {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:\\HaiThanh\\hoccode\\Java\\CODE_PTIT\\src\\code_ptit\\DATA.in"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
