package code_ptit;
import java.util.*;
class Point3D{
    int x, y, z;
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(Point3D p){
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }
    public static Point3D vector(Point3D p1, Point3D p2){
        return new Point3D(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
    }
    public static Point3D cross(Point3D p1, Point3D p2){
        int a = p1.y * p2.z - p1.z * p2.y;
        int b = p1.z * p2.x - p1.x * p2.z;
        int c = p1.x * p2.y - p1.y * p2.x;
        return new Point3D(a, b, c);
    }
    public static int dot(Point3D p1, Point3D p2){
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D AB = Point3D.vector(p1, p2);
        Point3D AC = Point3D.vector(p1, p3);
        Point3D AD = Point3D.vector(p1, p4);
        int res = Point3D.dot(AB, Point3D.cross(AC, AD));
        return res == 0;
    }
}
public class J04011_bondiemtrenmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
