import java.util.Scanner;

public class RockPaperScissorProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissor.");
        System.out.println(("When I say 'shoot',Choose:rock, paper, or scissor.\n"));
        System.out.println("Are you ready?Write 'yes' if you are ready.");
        String response=sc.nextLine();
        if(response.equals("yes"))
        {
            System.out.println("Great!!!");
            System.out.println("rock-paper-scissor,shoot!");
            String userChoice=sc.nextLine();
            String comChoice=computerChoice();
            String finalResult=result(userChoice,comChoice);
            printResult(userChoice, comChoice, finalResult);


        }
        else
        {
            System.out.println("Darn,Some other time.....!!!");
        }
        sc.close();

    }
    public static String result(String userChoice,String comCoice)
    {
        String result="";
        if (userChoice.equals("rock")&& comCoice.equals("scissor"))
        {
            return "You win";
        }
        else if (userChoice.equals("paper")&& comCoice.equals("rock"))
        {
            return "You win";
        }
        else if (userChoice.equals("scissor")&& comCoice.equals("paper"))
        {
            return "You win";
        }
        else if(userChoice.equals("scissor")&& comCoice.equals("rock"))
        {
            return "You loose";
        }
        else if (userChoice.equals("rock")&& comCoice.equals("paper"))
        {
            return "You loose";
        }
        else if (userChoice.equals("paper")&& comCoice.equals("scissor"))
        {
            return "You loose";
        }
        else if(userChoice.equals(comCoice))
        {
            return "its a tie";
        }
        else 
        {
           System.out.println("Invalid Choice");
           System.exit(0);
        }
        return result;
        


    }
    public static String computerChoice()
    {
       int randomNumber=(int) Math.random()*3;
       switch (randomNumber) {
        case 0:return "rock";
        case 1:return "paper";
        case 2:return "scissor";
        default:return "Error in the app.Buggy buggy is present.";
            
       }
    }
    public static void printResult(String userChoice,String comChoice,String result)
    {
        System.out.println("\nUser chose: "+userChoice);
        System.out.println("\nThe computer chose: "+comChoice);
        System.out.println(result);
    }
}
