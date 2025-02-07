import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*****Welcome to XYZ bank*****");
        System.out.println("Do you want mortgage??(Say yes or no)");
        String ans=sc.nextLine();
        if(ans.equals("yes"))
        {
            System.out.println("Enter how much money do you have in your savings and also teh debt you have");
            double savings=sc.nextDouble();
            double debt=sc.nextDouble();
            System.out.println("How many years have you worked for");
            int years=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter you name");
            String name=sc.nextLine();
            if(savings>=10000 && debt<5000 && years>2 )
            {
                System.out.println(name+" Congratulations!!! You are eligible");
            }
            else
            {
                System.out.println(name+" You are not eligible.Thank you for choosing our bank");
            }


        }
        else
        {
            System.out.println("\nOK. Have a nice day!");
        }
        sc.close();
    }
}
