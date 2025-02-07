import java.util.Scanner;
public class DiceProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int roll1=rollDice();
        int roll2=rollDice();
        int roll3=rollDice();

        System.out.println("Enter three numbers between 1-6");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
    
        if(isLessThan1(n1, n2, n3)||isGreaterThan6(n1, n2, n3))
        {
            System.out.println("You are not choosing the numbers properly...make sure you have entered the numbers between 1 to 6");
            System.exit(0);
        }
        int sumOfNumbers=n1+n2+n3;
        int sumOfDiceRolls=roll1+roll2+roll3;
        System.out.println("Your sum is: "+sumOfNumbers+"\nDice sum is: "+sumOfDiceRolls);
        if ((userWon(sumOfNumbers, sumOfDiceRolls))) {
            System.out.println("\nHurray!!!You won");
        }
        else{
            System.out.println("\nBetter luck next time");
        }

        
        sc.close();
    }
    public static boolean isLessThan1(int num1,int num2,int num3)
    {
        return(num1<1||num2<1||num3<1);
    }
    public static boolean isGreaterThan6(int num1 ,int num2,int num3)
    {
        return(num1>6||num2>6||num3>6);
    }
    public static boolean userWon(int sumNumbers,int sumDiceRolls)
    {
        return(sumNumbers>sumDiceRolls && sumNumbers-sumDiceRolls<3 );
        
    }

    public static int rollDice()
    {
        double randomNumber=Math.random()*6+1;
        return (int)randomNumber;
    }
    
}
