package code_ptit;
import java.util.*;
import java.io.*;
class Name{
    String name;
    public Name(String name){
        this.name = name;
    }
    public String chuanHoa(){
        String[] word = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String w : word){
            res += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
        }
        return res.trim();
    }
    public String Ten(){
        String[] word = chuanHoa().split("\\s+");
        return word[word.length - 1];
    }
    public String Ho(){
        String[] word = chuanHoa().split("\\s+");
        return word[0];
    }
    public String Dem(){
        String[] word = chuanHoa().split("\\s+");
        String res = "";
        for(int i = 1; i < word.length - 1; i++){
            res += word[i] + " ";
        }
        return res.trim();
    }
}
class SortName implements Comparator<Name>{
    public int compare(Name a, Name b){
        if(a.Ten() == null ? b.Ten() != null : !a.Ten().equals(b.Ten()))
            return a.Ten().compareTo(b.Ten());
        if(a.Ho() == null ? b.Ho() != null : !a.Ho().equals(b.Ho()))
            return a.Ho().compareTo(b.Ho());
        return a.Dem().compareTo(b.Dem());
    }
}
public class J07072_chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("DANHSACH.in"));
        ArrayList<Name> ds = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            ds.add(new Name(s));
        }
        Collections.sort(ds, new SortName());
        for(Name it : ds)
            System.out.println(it.chuanHoa());
    }
}
