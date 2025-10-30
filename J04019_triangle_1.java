package code_ptit;
import java.util.*;
import java.math.*;
class Point{
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }
    public double distance(Point k){
        return Math.sqrt(Math.pow(this.x - k.x, 2.0) + Math.pow(this.y - k.y, 2.0));
    }
}
class Triangle{
    private Point p1, p2, p3;
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        double ab = p1.distance(p2);
        double bc = p2.distance(p3);
        double ac = p3.distance(p1);
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }
    public String getPerimeter(){
        double ab = p1.distance(p2);
        double bc = p2.distance(p3);
        double ac = p3.distance(p1);
        double res = ab + bc + ac;
            return String.format("%.3f", res);
    }
}
public class J04019_triangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
