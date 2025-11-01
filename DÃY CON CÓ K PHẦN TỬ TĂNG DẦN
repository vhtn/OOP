package code_ptit;
import java.util.*;

public class J02026_dayconcokphantutangdan {
    public static ArrayList<ArrayList<Integer>> res;

    public static void Try(int n, int k, int a[], int x, ArrayList<Integer> current){
        if(current.size() == k){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i = x; i <= n - (k - current.size()); i++){
            current.add(a[i]);
            Try(n, k, a, i + 1, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a); 
            res = new ArrayList<>();
            Try(n, k, a, 0, new ArrayList<>());
            for(ArrayList<Integer> it : res){
                for(Integer i : it){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
