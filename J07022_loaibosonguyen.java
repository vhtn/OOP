package code_ptit;
import java.util.*;
import java.io.*;
public class J07022_loaibosonguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> se = new ArrayList<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                sc.next();
            }
            else{
                se.add(sc.next());
            }
        }
        Collections.sort(se);
        for(String it : se){
            System.out.print(it + " ");
        }
    }
}
