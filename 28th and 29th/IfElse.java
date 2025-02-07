public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if(biologyGrade>chemistryGrade)
        {
            System.out.println("Yes! You did.");
        }
        else{
            System.out.println("No, You did not.");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if(sales>costs)
        {
            System.out.println("Yes!We did.");
        }
        else{
            System.out.println("No,We did not.");
        }
        // Add if-else statement here

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if(temperature<targetTemperature)
        {
            System.out.println("Yes,It is");
        }
        else{
            System.out.println("No,It is not");
        }
        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if(currentSpeed<speedLimit)
        {
            System.out.println("Yes,You are");
        }
        else{
            System.out.println("No,You are not");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age<retirementAge)
        {
            System.out.println("No,You are not");
        }
        else
        {
            System.out.println("Yes,You are");
        }
        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if(myGrade>=bestGrade)
        {
            System.out.println("Yes,You got");
        }
        else
        {
            System.out.println("No,You did not");
        }
        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement he
        if(word.equals(secondWord))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if(!(thirdWord.equals(fourthWord)))
        {
            System.out.println("yes");
        }
       
    }
}
