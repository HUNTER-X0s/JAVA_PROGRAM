class circle{
    float r;
    public double area(){
        return 3.14f*r*r;
    }
    public float perimeter(){
        return 2*3.14f*r;
    }
}
public class class_circle {
    public static void main(String[] args) {
        circle s=new circle();
        s.r=4;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
