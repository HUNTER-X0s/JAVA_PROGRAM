class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class class_rectangle {
    public static void main(String[] args) {
        rectangle R=new rectangle();
        R.length=4;
        R.breadth=5;
        System.out.println(R.area());
        System.out.println(R.perimeter());
    }
}
