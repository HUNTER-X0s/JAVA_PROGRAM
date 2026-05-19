abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
     void write(){
        System.out.println("writing something");
    }
     void refill(){
        System.out.println("refilling pen");
    }
     void changenib(){
        System.out.println("changing the nib");
    }
}
public class abstarct_class_pen {
    public static void main(String[] args) {
        fountainpen p= new fountainpen();
        p.write();
        p.refill();
        p.changenib();
    }
}
