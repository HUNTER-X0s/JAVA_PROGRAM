import java .util.*;
public class calculate_cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sub1=sc.nextFloat();
        float sub2=sc.nextFloat();
        float sub3=sc.nextFloat();
        float calculate_cgpa=(sub1+sub2+sub3)/30;
        System.out.print("The cgpa is :");
        System.out.println(calculate_cgpa);
    }
}
