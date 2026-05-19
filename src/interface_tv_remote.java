interface tvremote{
    void on();
    void volumup();
    void voulumdown();

}
interface smartTvRemote extends tvremote{
   void switchChannel();
   void off();

}
class tv implements tvremote {
    public void on() {
        System.out.println("on the tv");
    }
    public void volumup() {
        System.out.println("volume up");
    }
    public void voulumdown() {
        System.out.println("volume down");
    }
    public  void switchChannel(){
        System.out.println("switch to another channel");
    }
    public void off(){
        System.out.println("switch off the tv");
    }
}
    public class interface_tv_remote {
        public static void main(String[] args) {
            tv r = new tv();
            r.on();
            r.volumup();
            r.voulumdown();
            r.switchChannel();
            r.off();
        }
    }
