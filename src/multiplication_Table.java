import java.util.Scanner;
public class multiplication_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d =%d \n",n,i,n*i);
        }
        System.out.println(" ");
    }
}
