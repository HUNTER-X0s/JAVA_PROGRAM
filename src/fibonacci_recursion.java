public class fibonacci_recursion {
     static void fibonacci(int n){
             int FN = 0, SN = 1, NN=0;
             for (int i = 1; i <= n; i++) {
                 System.out.print(FN +" ");
                 NN = FN + SN;
                 FN = SN;
                 SN = NN;
             }
     }
    public static void main(String[] args) {
        int n=10;
      fibonacci(n);
    }
}
