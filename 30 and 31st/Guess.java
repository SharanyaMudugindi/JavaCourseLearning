import java.util.Scanner;
public class Guess {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*100 )+1;
        //int num=(int)number;
        System.out.println("Take a guess of number between 1 to 100");
        int guess=sc.nextInt();
        while(guess!=number)
        {
            if(guess<number)
            {
                System.out.println("The number is greater than your guess");
            }
            else
            {
                System.out.println("The number is lesser than your guess");
            }
            System.out.println("Take a guess again");
            guess=sc.nextInt();

        }
        System.out.println("Woahhhh You guessed it rigth :>");
        sc.close();



    }
    
}
