import java.util.Scanner;
public class WorkSchedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which day it is");
        int day=sc.nextInt();
        boolean holiday = false;

        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } 
        else if(day>=8)
        {
            System.out.println("Not a valid day..Enter a valid day");
        }
        else {
            System.out.println("Wake up at 7:00 :(");
        }
        sc.close();

    }
}