import java .io.*;
import java.util.*;
public class percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take marks between 1 to 100");
        System.out.println("enter the marks in math :");
        float maths=sc.nextFloat();
        System.out.println("enter the marks in physics:");
        float physics=sc.nextFloat();
        System.out.println("enter the marks in biology :");
        float biology=sc.nextFloat();
        System.out.println("enter the marks in chemistry :");
        float chemistry=sc.nextFloat();
        System.out.println("enter the marks in english :");
        float english=sc.nextFloat();

        float calculate_percentage=(maths+physics+biology+chemistry+english)*100/500;
        System.out.print("The percentage is :");
        System.out.println(calculate_percentage);
    }
}
