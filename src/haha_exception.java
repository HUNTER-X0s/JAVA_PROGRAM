
public class haha_exception {
    public static void main(String[] args) {
        int a =2;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("hehe");
        }
        catch(IllegalArgumentException e){
            System.out.println("haha");
        }
    }
}
