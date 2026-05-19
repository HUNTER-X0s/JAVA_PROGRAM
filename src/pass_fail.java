import java.util.*;
public class pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        int marks1 =sc.nextInt();
        System.out.println("enter marks of subject 2");
        int marks2=sc.nextInt();
        System.out.println("enter marks of subject 3");
        int marks3 =sc.nextInt();
        float percentage=(marks1 +marks2+ marks3)*100f/300f;
        System.out.println("your percentage is : "+percentage);
        if(percentage>40 && marks1>33 && marks2>33 && marks3>33){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
