package code_ptit;
import java.util.*;
import java.io.*;
public class J07008_daycontangdan {
    public static ArrayList<String> res;
    public static boolean check(ArrayList<Integer> a){
        for(int i = 1; i < a.size(); i++){
            if (a.get(i) < a.get(i-1))
                return false;
        }
        return true;
    }
    public static void Try(int n, int a[], int x, ArrayList<Integer> cur){
        if(cur.size() >= 2 && check(cur)){
            StringBuilder sb = new StringBuilder();
            for(int it : cur)
                sb.append(it).append(" ");
            res.add(sb.toString());
        }
        for(int i = x; i < n; i++){
            cur.add(a[i]);
            Try(n, a, i+1, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        res = new ArrayList<>();
        Try(n, a, 0, new ArrayList<>());
        Collections.sort(res);
        for(String it : res)
            System.out.println(it);
    }
}