import java .util.Random;
import java .util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("||<enter 0 for rock >||< 1 for paper >||< 2 for scissor>||");
        System.out.print("your choice :");

        int userinput=sc.nextInt();
        if(userinput==0){
            System.out.println("your choice :Rock");
        }
        else if(userinput==1){
            System.out.println("your choice :paper");
        }
        else if(userinput==2){
            System.out.println("your choice :scissor");
        }

        Random random =new Random();
        int computerinput=random.nextInt(3);

        System.out.println("computer choice:"+computerinput);
        if(computerinput==0){
            System.out.println("computer choice :Rock");
        }
        else if(computerinput==1){
            System.out.println("computer choice :paper");
        }
        else if(computerinput==2){
            System.out.println("computer choice :scissor");
        }

        if(userinput==computerinput){
            System.out.println("||<draw>||");
        }
        else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 ||
        userinput==2 && computerinput==1){
            System.out.println("||<you win !>||");
        }
        else{
            System.out.println("<||computer win !>||");
        }
    }
}
