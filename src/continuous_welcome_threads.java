class mythread extends Thread{
    public void run(){
        while(true){
        System.out.println("good morning");
        }
   }
}
class mythread1 extends Thread{
    public void run(){
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        while(true){
            System.out.println("welcome");
        }
    }
}
public class continuous_welcome_threads {
    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread1 t2=new mythread1();
        t1.start();
        t2.start();
    }
}
