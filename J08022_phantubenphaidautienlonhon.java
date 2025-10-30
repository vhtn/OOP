package code_ptit;
import java.util.*;
public class J08022_phantubenphaidautienlonhon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int i = 0;
            ArrayList<Integer> res = new ArrayList<>();
            while(i < n){
                boolean check = false;
                for(int j = i + 1; j < n; j++){
                    if(a[j] > a[i]){
                        res.add(a[j]);
                        check = true;
                        break;
                    }
                }
                if(!check)
                    res.add(-1);
                i++;
            }
            for(Integer it : res)
                System.out.print(it + " ");
            System.out.println();
        }
    }
}

