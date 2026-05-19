class rockstar{
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing the enemy");
    }
    public void hit(){
        System.out.println("hitting on the enemy");
    }
}
public class class_Tommy_vecetti {
    public static void main(String[] args) {
        rockstar r=new rockstar();
        r.fire();
        r.run();
        r.hit();
    }
}
