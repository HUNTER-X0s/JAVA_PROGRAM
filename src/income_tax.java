import java.util.*;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float tax=0;
        System.out.println("enter your annual package in lakhs : " );
        float amount= sc.nextFloat();
        if(2.5f<=amount  && amount<5.0f){
            tax=tax+0.05f*(amount-2.5f);
            System.out.println("you have to pay 5% Tax");
        }
        else if(5.0f<=amount && amount<10.0f){
            System.out.println("you have to pay 20% Tax");
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(amount-5.0f);
        }
        else if(amount>10.0f){
            System.out.println("you have to pay 30% Tax");
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(amount-10.0f);
        }
        else if(amount<2.5f){
            System.out.println("no tax");
            tax=tax+0;
        }
        System.out.println("The total tax paid by the employee is :"+tax);
    }
}
