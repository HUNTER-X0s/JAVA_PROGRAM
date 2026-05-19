class Rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle() {
         this.length=4;
         this.breadth=5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
public class rectangle_overload_constructor {
    public static void main(String[] args) {
      Rectangle over= new Rectangle(12,34);
        System.out.println(over.getLength());
        System.out.println(over.getBreadth());
    }
}
