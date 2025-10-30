package code_ptit;
import java.util.*;
class IntSet {
    private List<Integer> element;
    public IntSet (int[] a){
        element = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : a){
            set.add(x);
        }
        element.addAll(set);
    }
    public IntSet  union(IntSet  k){
        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(this.element);
        set.addAll(k.element);
        int a[] = set.stream().mapToInt(Integer::intValue).toArray();
        return new IntSet (a);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int x : element){
            sb.append(x).append(" ");
        }
        if(sb.length() > 0)
            sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
public class J04021_lopinset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
