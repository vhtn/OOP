package code_ptit;
import java.math.*;
import java.util.*;
class PhanSo{
    private BigInteger tu;
    private BigInteger mau;
    public PhanSo(BigInteger tu, BigInteger mau){
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo p){
        this.tu = p.tu;
        this.mau = p. mau;
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
    public PhanSo tong(PhanSo secondPhanSo){
        PhanSo p = this.rutgon();
        PhanSo q = secondPhanSo.rutgon();
        BigInteger y = p.mau.multiply(q.mau).divide(p.mau.gcd(q.mau));
        BigInteger x = y.divide(p.mau).multiply(p.tu).add(y.divide(q.mau).multiply(q.tu));
        return new PhanSo(x, y).rutgon();
    }
    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
public class J04004_tongphanso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger t1 = sc.nextBigInteger();
        BigInteger m1 = sc.nextBigInteger();
        BigInteger t2 = sc.nextBigInteger();
        BigInteger m2 = sc.nextBigInteger();
        PhanSo p = new PhanSo(t1, m1);
        PhanSo q = new PhanSo(t2, m2);
        System.out.print(p.tong(q));
    }
}
