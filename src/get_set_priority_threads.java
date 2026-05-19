class mythread5 extends Thread{
    public void run(){
            System.out.println("good morning");
    }
}
class mythread10 extends Thread{
    public void run(){
        System.out.println("welcome");
    }
}
public class get_set_priority_threads {
    public static void main(String[] args) {
        mythread5 mt5=new mythread5();
        mythread10 mt10= new mythread10();
//        mt5.setPriority(6);
//        mt10.setPriority(9);
        System.out.println(mt5.getPriority());
        System.out.println(mt10.getPriority());
        System.out.println(mt10.getState());
        mt5.start();
        mt10.start();
        System.out.println(mt10.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
