class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surafcearea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 1.333333333333333*Math.PI*radius*radius*radius;
    }
}
public class class_sphere_getset {
    public static void main(String[] args) {
        sphere s=new sphere();
        s.setRadius(5);
        System.out.println(s.getRadius());
        System.out.println(s.surafcearea());
        System.out.println(s.volume());
    }
}
