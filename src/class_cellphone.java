class phone{
    public void ringing(){
        System.out.println("the phone is ringing");
    }
    public void vibrating(){
        System.out.println("the phone is vibrating");
    }
}
public class class_cellphone {
    public static void main(String[] args) {
        phone poco=new phone();
        poco.ringing();
        poco.vibrating();
    }
}
