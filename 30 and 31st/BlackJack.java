import java.util.Scanner;
public class BlackJack {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System. out .println("\nWelcome to Java Casino!") ;
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see .. ");
        System.out.println(" .. Ready? Press anything to begin!");
        sc.nextLine();  
        int card1=randomCard();
        int card2=randomCard();
        System.out.println("\n You get a \n" + cardString(card1)+"\n and a \n"+ cardString(card2));
        int total=Math.min(card1,10)+Math.min(card2,10);
        System.out.println("Your total is  "+total);

        int dealerCard1=randomCard();
        int dealerCard2=randomCard();
        System.out.println("\n The dealer shows a card \n"+cardString(dealerCard1)+"\n and has a facing down card"+faceDown());
        int dealerTotal=Math.min(dealerCard1, 10)+Math.min(dealerCard2, 10);
        System.out.println("\n The dealers total is hidden");

        while(true)
        {
        String option=hitOrStay();
        if(option.equals("stay"))
        {
            break;
        }
        int newCard=randomCard();
        total+=Math.min(newCard,10);
        System.out.println("\n You get a\n"+cardString(newCard));
        System.out.println("Your total is "+total);
        if(total>21)
        {
            System.out.println(("Bust! Player looses"));
            System.exit(0);
        }
        } 
        System.out.println("Its the dealers's turn");
        System.out.println("\n The dealer's card are \n "+cardString(dealerCard1)+"\n and a\n"+cardString(dealerCard2));  
        while(dealerTotal<17)
        {
            int newCard=randomCard();
            dealerTotal+=Math.min(newCard, 10);
            System.out.println("\n Dealer gets a\n"+cardString(newCard));
            System.out.println("Dealer's total is "+dealerTotal);
        }
        if(dealerTotal>21)
        {
            System.out.println("Bust!!!The dealer loses");
            System.exit(0);
        }
        if(total>dealerTotal)
        {
        System.out.println("Player wins!!");
        }
        else{
            System.out.println("Dealer wins wins!!");
        }


        
    }

    public static String hitOrStay() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }

    public static int randomCard()
    {
        return (int)(Math.random()*13);
    }
    public static String cardString(int cardNumber)
    {
        switch(cardNumber)

        {
            case 1:return 
                            "   _____\n"+
                            "  |A _  |\n"+ 
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";
            case 2:return 
                            "   _____\n"+              
                            "  |2    |\n"+ 
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";
            case 3:return 
                                "   _____\n" +
                                "  |3    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____E|\n";
            case 4:return 
            
                            "   _____\n" +
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";

            case 5:return 
                            "   _____ \n" +
                            "  |5    |\n" +
                            "  | o o |\n" +
                            "  |  o  |\n" +
                            "  | o o |\n" +
                            "  |____S|\n";
            case 6:return 
                            "   _____ \n" +
                            "  |6    |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  |____6|\n";
            case 7:return 
            
                            "   _____ \n" +
                            "  |7    |\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |____7|\n";
  
            case 8:return 
                            
                            "   _____ \n" +
                            "  |8    |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  |____8|\n";
            case 9:return 
            
                            "   _____ \n" +
                            "  |9    |\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |____9|\n";
            case 10:return 
                            "   _____ \n" +
                            "  |10  o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |___10|\n";
            case 11:return 
            
                            "   _____\n" +
                            "  |J  ww|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o% |\n"+ 
                            "  | | % |\n"+ 
                            "  |__%%[|\n";
            case 12:return 
                            "   _____\n" +
                            "  |Q  ww|\n"+ 
                            "  | o {(|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%O|\n";
            case 13:return 
                            "   _____\n" +
                            "  |K  WW|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%>|\n";
            default: return "This should never get called";


        }
        

    }
    public static String faceDown() {
        return
        "\n"+
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
}
