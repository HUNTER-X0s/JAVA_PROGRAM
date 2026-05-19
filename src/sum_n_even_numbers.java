
import java.util.Scanner;
public class sum_n_even_numbers {
    //for loop
  /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
              sum=sum+(2*i);
         }
        System.out.println("the sum of even numbers is :"+sum);
    }
    */
    //while loop
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number: ");
      int n=sc.nextInt();
      int i=0;
      int sum=0;
      while(i<n){
          sum=sum+(2*i);
          i++;
      }
      System.out.println("the sum of even numbers is :"+sum);
  }
}
