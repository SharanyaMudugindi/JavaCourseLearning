public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TODO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement
        System.out.println("Example 1");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TODO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement
        System.out.println("Example 2");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
        System.out.println("Example 3");
        for(int i=31;i<100;i++)
        {
            if(i%3==0)
            {
                System.out.println(i);
                break;
            }
        }
        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
        System.out.println("Example 4");
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);

        }
    }
}
