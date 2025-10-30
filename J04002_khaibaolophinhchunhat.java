package code_ptit;
import java.util.*;
class Rectange{
    private double width;
    private double height;
    private String color;
    public Rectange(){
        this.width = 1;
        this.height = 1;
        this.color = "while";
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHiegth(){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public double findArea(){
        return (height * width);
    }
    public double findPerimeter(){
        return (2 * (height + width));
    }
}
public class J04002_khaibaolophinhchunhat {
    public static String chuanhoa(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String c = sc.next();
        Rectange res = new Rectange(x, y, c);
        if(x <= 0 || y <= 0)
            System.out.println("INVALID");
        else{
            System.out.print(String.format("%.0f %.0f %s", res.findPerimeter(), res.findArea(), chuanhoa(c)));
        }
        
    }
}
