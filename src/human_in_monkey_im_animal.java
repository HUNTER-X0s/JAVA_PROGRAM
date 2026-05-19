class monkey{
    public void jump(){
        System.out.println("monkey jumps");
    }
    public void bite(){
        System.out.println("monkey bites");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir");
    }
    public void eat(){
        System.out.println("animals eat");
    }
    public void sleep(){
        System.out.println("animals sleep");
    }
}
public class human_in_monkey_im_animal{
    public static void main(String[] args) {
        BasicAnimal BA=new human();
       BA.eat();
       BA.sleep();
       human h=new human();
       h.speak();
       monkey m=new human();
       m.bite();
       m.jump();
    }
}
