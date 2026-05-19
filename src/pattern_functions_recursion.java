public class pattern_functions_recursion {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternR(int n) {
        if (n > 0) {
            patternR(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        pattern(4);
        patternR(4);
    }
}
