class mycylinder{
    private int radius;
    private int height;

  public mycylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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
public class maincylinder_constructor {
    public static void main(String[] args) {
        mycylinder cd = new mycylinder(4,5);
   //   cd.setheight(4);
   //     cd.setradius(5);
        System.out.println(cd.getradius());
        System.out.println(cd.getheight());
        System.out.println(cd.volume());
        System.out.println(cd.surfacearea());
    }
}

