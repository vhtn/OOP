package code_ptit;
import java.util.*;
class Point{
    double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }
    public double distance(Point p1, Point p2){
        return p1.distance(p2);
    }
    @Override
    public String toString(){
        return "(" + x + "," + y +")";
    }
}
public class J04010_dientichhinhtrongngoaitieptamgiac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            if(a + b <= c || b + c  <= a || a + c <= b)
                System.out.println("INVALID");
            else{
                double s1 = a+b+c;
                double s2 = a+b-c;
                double s3 = b+c-a;
                double s4 = c+a-b;
                double s = Math.sqrt(s1*s2*s3*s4);
                double r = a*b*c/s;
                double res = Math.PI * r * r;
                System.out.println(String.format("%.3f", res));
            }
        }
    }
}
