class Circle{
    public int radius;

    Circle(int r){
        System.out.println("constructor 1");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

    Cylinder(int r,int h){
        super(r);
        System.out.println("constructor 2");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;

    }
}
public class cylinder5inheritscircle5 {
    public static void main(String[] args) {
        Cylinder x=new Cylinder(3,5);
        System.out.println(x.area());
        System.out.println(x.volume());
    }
}