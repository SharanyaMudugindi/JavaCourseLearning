public class DoubleDice {
  public static void main(String[] args) {
    int dice1=rollDice();
    int dice2=rollDice();
    System.out.println("The roll of First dice "+dice1);
    System.out.println("The roll of Second dice "+dice2);
    while(dice1!=dice2)
    {
        System.out.println("The numbers did not match.Die is being rolled again");
        dice1=rollDice();
        dice2=rollDice();
        System.out.println("\nThe roll of First dice "+dice1);
        System.out.println("The roll of Second dice "+dice2);


    }
    System.out.println("\nWoahhh!!! Both the die got the correct value:)");


}
    public static int rollDice()
    {
        return (int)(Math.random()*6)+1;
    }
}
    

