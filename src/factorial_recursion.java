public class factorial_recursion {
    static int factorial(int n){
               if(n==0 || n==1){
                   return 1;
               }
               else{
              // return n*factorial(n-1);
                   int factorial=1;
                   for(int i=1;i<=n;i++){
                       factorial=factorial*i;
                   }
                   return factorial;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The value of factorial of n is :"+factorial(n));
    }
}
