class cylinder{
   private int radius;
    private int height;
    public void setradius(int r){
        radius=r;
    }
    public int getradius(){
        return radius;
    }
    public void setheight(int h){
        height=h;
    }
    public int getheight(){
        return height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class class_cylinder_getset {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setradius(56);
        c.setheight(45);
        System.out.println(c.getradius());
        System.out.println(c.getheight());
        System.out.println(c.surfacearea());
        System.out.println(c.volume());
    }
}
