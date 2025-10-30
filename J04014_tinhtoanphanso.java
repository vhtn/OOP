package code_ptit;
import java.util.*;
class PS{
    private long tu, mau;
    public PS(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public static long gcd(long a, long b){
        while(b != 0){
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static PS rg(PS p){
        long ucln = gcd(p.tu, p.mau);
        return new PS(p.tu/ucln, p.mau/ucln);
    }
    public static PS tong(PS p1, PS p2){
        p1 = rg(p1);
        p2 = rg(p2);
        long m = p1.mau * p2.mau / gcd(p1.mau, p2.mau);
        long t = p1.tu * (m / p1.mau) + p2.tu * (m/p2.mau);
        PS res = new PS(t, m);
        return rg(res);
    }
    public static PS tich(PS p1, PS p2){
        p1 = rg(p1);
        p2 = rg(p2);
        PS res = new PS(p1.tu * p2.tu, p1.mau * p2.mau);
        return rg(res);
    }
    public static PS bt1(PS p1, PS p2){
        PS res = tong(p1, p2);
        return tich(res, res);
    }
    public static PS bt2(PS p1, PS p2){
        PS res = tich(p1, p2);
        return tich(res, bt1(p1, p2));
    }
    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
public class J04014_tinhtoanphanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long d = sc.nextInt();
            PS p1 = new PS(a, b);
            PS p2 = new PS(c, d);
            PS s1 = PS.bt1(p1, p2);
            PS s2 = PS.bt2(p1, p2);
            System.out.println(s1 + " " + s2);
        }
    }
}
