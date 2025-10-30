package code_ptit;
import java.util.*;
import java.math.*;
class sophuc{
    private long thuc, ao;
    public sophuc(long thuc, long ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    public sophuc tong(sophuc k){
        long t = this.thuc + k.thuc;
        long a = this.ao + k.ao;
        return new sophuc(t, a);
    }
    public sophuc tich(sophuc k){
        long t = this.thuc * k.thuc - this.ao * k.ao;
        long a = this.thuc * k.ao + this.ao * k.thuc;
        return new sophuc(t, a);
    }
    public sophuc binhphuong(){
        long t = thuc * thuc - ao * ao;
        long a = 2 * thuc * ao;
        return new sophuc(t, a);
    }
    @Override
    public String toString(){
        if(ao < 0)
            return thuc + " - " + Math.abs(ao) + "i";
        return thuc + " + " + ao + "i";
    }
}
public class J04015_sophuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sophuc z1 = new sophuc(a, b);
            sophuc z2 = new sophuc(c, d);
            sophuc z3 = z1.tong(z2).tich(z1);
            sophuc z4 = z1.tong(z2).binhphuong();
            System.out.println(z3 + ", " + z4);
        }
    }
}
