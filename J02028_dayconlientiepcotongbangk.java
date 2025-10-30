package code_ptit;
import java.util.*;
public class J02028_dayconlientiepcotongbangk {
    public static boolean check;
    public static ArrayList<ArrayList<Integer>> res;
    public static boolean sum(int k, ArrayList<Integer> cur){
        int sum = 0;
        for(Integer it : cur)
            sum += it;
        return sum == k;
    }
    public static void Try(int n, int k, int a[], int x, ArrayList<Integer> current){
        if(sum(k, current)){
            res.add(current);
            return;
        }
        for(int i = x; i < n; i++){
            current.add(a[i]);
            Try(n, k, a, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            check = false;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            res = new ArrayList<>();
            Try(n, k, a, 0, new ArrayList<>());
            if(!res.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
