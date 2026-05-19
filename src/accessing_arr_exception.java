import java.util.Scanner;
class myexception extends Exception{
    
}
public class accessing_arr_exception {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc =new Scanner(System.in);
        int index;
        int arr[]=new int [3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=8;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("enter a index :");
                index=sc.nextInt();
                System.out.println(arr[index]);
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("error");
        }
    }
}
