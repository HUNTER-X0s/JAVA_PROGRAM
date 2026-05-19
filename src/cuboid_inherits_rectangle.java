class rectangle5 {
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;
    }
}
class cuboid extends rectangle5{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume(){
        return area()*height;
    }
}
public class cuboid_inherits_rectangle {
    public static void main(String[] args) {
        cuboid z=new cuboid();
        z.setLength(3);
        System.out.println(z.getLength());
        z.setBreadth(4);
        System.out.println(z.getBreadth());
        z.setHeight(5);
        System.out.println(z.getHeight());
        System.out.println(z.area());
        System.out.println(z.volume());
    }
}
