public class cesius_to_fahrenheit_function {
    static int fahrenheit(int c){
        int f=c*9/5+32;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fahrenheit(37));
    }
}
