import java.util.Scanner;
public class JavaRolls {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi Welcom lets play the game.");
        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6 the game stops.");
        System.out.println(" - If you roll a 4 nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        int score = 0;
        while(true)
        {
          sc.nextLine();
          int dice=rollDice();
          System.out.println("You rolled the dice: "+dice);
          if(dice==6)
          {
            System.out.println("End of the gameeee");
            break;
          }
          else if(dice==4)
          { 
            System.out.println("No points");
          }
          else
          {
            System.out.println("you got a point");
            score++;
          }
        }
        System.out.println("Your score is "+score);
        if (score>=3)
        {
            System.out.println("Hurray!!! You won");
        }
        else{
            System.out.println("Darn, You lost");
        }
        sc.close();

    }
    public static int rollDice()
    {
        return (int)(Math.random()*6 +1) ;
    }
}