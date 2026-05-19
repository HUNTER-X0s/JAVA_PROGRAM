//CREATE A CLASS GAME, WHICH ALLOWS A USER TO PLAY "GUESS THE NUMBER" GAME ONCE
/*
Game should have the following methods :
1. constructor to generate random number.
2. Take a userinput() to take a user input of number.
3. iscorrectnumber() to detect whether the number entered by the user is true.
4. getters and setters for no.of.guesses.
use properties such as no.of.guesses(int),etc to get this task done!
 */

import java .util.*;
class game{
    int noofguesses=0;
    public int computernumber;
    public int inputnumber;

    game(){
        Random rand=new Random();
        computernumber= rand.nextInt(100);
    }
    public void userinput(){
        System.out.println("guess the number :");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguesses++;
        if(computernumber==inputnumber){
            System.out.printf("you guessed it right, it was %d\nFUCK!!\n" +
                            " you guessed it in %d attempts\n<||BETTER LUCK NEXT TIME||>",
                    computernumber,noofguesses);
            return true;
        }
        else if(inputnumber<computernumber){
            System.out.println("too low...");
        }
        else if(inputnumber>computernumber){
            System.out.println("too high...");
        }
            return false;
    }

}
public class guessing_game {
    public static void main(String[] args) {
        game g =new game();
        boolean b=false;
        while (!b) {
            g.userinput();
            b=g.iscorrectnumber();
        }
    }
}
