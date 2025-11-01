package code_ptit;
import java.util.*;
class SortMM implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        int k = Math.min(a.size(), b.size());
        for(int i = 0; i < k; i++){
            if(!a.get(i).equals(b.get(i)))
                return a.get(i) - b.get(i);
        }
        return a.size() - b.size();
    }
}
public class J02025_dayconcotongnguyento {
    public static ArrayList<ArrayList<Integer>> res;
    public static boolean ngto(int n){
        if (n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void Try(int n, int a[], int x, ArrayList<Integer> cur){
        if(!cur.isEmpty()){
            int sum = 0;
            for(int i : cur)
                sum += i;
            if(ngto(sum))
                res.add(new ArrayList<>(cur));
        }
        for(int i = x; i < n; i++){
            cur.add(a[i]);
            Try(n, a, i + 1, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n/2; i++){
                int tmp = a[i];
                a[i] = a[n-i-1];
                a[n-i-1] = tmp;
            }
            res = new ArrayList<>();
            Try(n, a, 0, new ArrayList<>());
            Collections.sort(res, new SortMM());
            for(ArrayList<Integer> it : res){
                for(Integer x : it){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
