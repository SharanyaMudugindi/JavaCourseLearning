import java.util.Scanner;
public class PizzaDelivery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many toppings do you need");
        int num=sc.nextInt();
        System.out.println("One by one enter your toppings");
        sc.nextLine();
        String[] toppings=new String[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter here....");
            System.out.print((i+1)+". ");
            toppings[i]=sc.nextLine();
        }
        System.out.println("\nThank you for choosing....\nHere is the list of toppings you chose");
        for(int i=0;i<num;i++)
        {
            System.out.print((i+1)+". "+toppings[i]);
            System.out.println("\n");

        }
        System.out.println("\nPress or type okay to confirm your order");
        String okay=sc.nextLine();
        while(!okay.equals("okay"))
        {
            System.out.println("okay is necessary to confirm your order");
            okay=sc.nextLine();
        }
        System.out.println("Hurrayyy!!!Your order is on the way.........");
        sc.close();
    

        
    }
    
}
