package code_ptit;
import java.util.*;
import java.io.*;
public class J07021_chuahoaxauhotentrongfile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            String[] w = s.trim().toLowerCase().split("\\s+");
            for(String it: w){
                it = it.substring(0, 1).toUpperCase() + it.substring(1).toLowerCase();
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
