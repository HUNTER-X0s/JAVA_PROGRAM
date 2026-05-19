class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class square_class{
    public static void main(String[] args) {
        square s=new square();
        s.side=4;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}