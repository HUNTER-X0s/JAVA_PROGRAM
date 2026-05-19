public class sum_nautral_recursion {
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    static int sumR(int n){
        if(n==1){
            return 1;
        }

            return n+sumR(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(sumR(4));
    }
}
