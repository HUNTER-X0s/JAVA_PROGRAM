import java.util.Scanner;
public class factorial_number {
  /* public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is :"+fact);
    }
    */
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number :");
      int n=sc.nextInt();
      int i=1;
      int fact=1;
      while(i<=n)
      {
          fact=fact*i;
          i++;
      }
      System.out.println("The factorial is :"+fact);
  }
}
