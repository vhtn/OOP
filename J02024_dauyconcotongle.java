package code_ptit;
import java.util.*;
class SortM implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        int k = Math.min(a.size(), b.size());
        for(int i = 0; i < k; i++){
            if(!a.get(i).equals(b.get(i)))
                return a.get(i)- b.get(i);
        }
        return a.size() - b.size();
    }
}
public class J02024_dauyconcotongle {
    public static ArrayList<ArrayList<Integer>> res;
    public static void Try(int n, int a[], int x, ArrayList<Integer> curr){
        if(!curr.isEmpty()){
            int sum = 0;
            for(int i : curr) sum += i;
            if(sum% 2 == 1){
                res.add(new ArrayList<>(curr));
            }
        }
        for(int i = x; i < n; i++){
            curr.add(a[i]);
            Try(n, a, i + 1, curr);
            curr.remove(curr.size() - 1);
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
            Collections.sort(res, new SortM());
            for (ArrayList<Integer> it : res){
                for(Integer x : it){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
