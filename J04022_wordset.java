package code_ptit;
import java.util.*;
class WordSet{
    private final List<String> element;
    public WordSet(String a){
        String[] w = a.toLowerCase().trim().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for(String x : w)
            if(!x.isEmpty())
                set.add(x);
        element = new ArrayList<>(set);
    }
    public WordSet union(WordSet k){
        TreeSet<String> set = new TreeSet<>(this.element);
        set.addAll(k.element);
        return new WordSet(String.join(" ", set));
    }
    public WordSet intersection(WordSet k){
        TreeSet<String> set = new TreeSet<>(this.element);
        set.retainAll(k.element);
        return new WordSet(String.join(" ", set));
    }
    @Override
    public String toString(){
        return String.join(" ", element);
    }
}
public class J04022_wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
