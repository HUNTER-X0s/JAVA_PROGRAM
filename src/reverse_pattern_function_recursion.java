public class reverse_pattern_function_recursion {
    static void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternR(int n) {
        if (n > 0) {
            for (int i = 0; i<n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            patternR(n - 1);
        }
    }
    public static void main(String[] args) {
        pattern(4);
        patternR(4);
    }
}
