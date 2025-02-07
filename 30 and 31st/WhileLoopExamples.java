public class WhileLoopExamples {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled
        System.out.println("Example 1");
        int diceRoll=-1;
        while(diceRoll!=6)
        {
            diceRoll=rollDice();
            System.out.println(diceRoll);
        }
        System.out.println("Example 2");
        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated
        int rNum=-1;
        while(rNum<=90)
        {
            rNum=rCounts();
            System.out.println("\n"+rNum);
        }
        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000
        System.out.println("Example 3");
        int rand=-1;
        while(rand<=1000)
        {
            rand=rCounts1();
            System.out.println("\n"+rand);

        }

    }
    //1
        public static int rollDice()
        {
            double  randNum=Math.random()*6+1;
            return (int)randNum;
        }
    //2
        public static int rCounts()
        {
            double randNum1=Math.random()*100;
            return (int)randNum1;
        }
    //3
    public static int rCounts1()
        {
            double randNum1=Math.random()*1500;
            return (int)randNum1;
        }
            
        
        

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    }
