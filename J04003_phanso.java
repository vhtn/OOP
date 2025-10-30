package code_ptit;
import java.util.*;
import java.math.*;
class PhanSo{
    private BigInteger tu;
    private BigInteger mau;
    public PhanSo(BigInteger tu, BigInteger mau){
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo p){
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public BigInteger getTu(){
        return tu;
    }
    public void setTu(BigInteger tu){
        this.tu = tu;
    }
    public BigInteger getMau(){
        return mau;
    }
    public void setMau(BigInteger mau){
        this.mau = mau;
    }
    public PhanSo rutgon(){
        BigInteger x = tu.gcd(mau);
        return new PhanSo(tu.divide(x), mau.divide(x));
    }
    public String ht(){
        return tu + "/" + mau;
    }
}
public class J04003_phanso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger t = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        PhanSo res = new PhanSo(t, m);
        System.out.print(res.rutgon().ht());
    }
}
