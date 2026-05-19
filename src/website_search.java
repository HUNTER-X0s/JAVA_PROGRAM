import java.util.*;
public class website_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a website");
        String website= sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
    }
}
