class animal{
    public void walk(){
        System.out.println("animal can walk");
    }
}
class dog extends animal{
    public void eat(){
        System.out.println("dog eats");
    }
}
public class Animal_inheritance {
    public static void main(String[] args) {
        dog D=new dog();
        D.eat();
        D.walk();
    }
}
