public class Table_recursion {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        table(7);
    }
}
