import java.util.Scanner;

public class groceries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String reply=scan.nextLine();
        boolean found=false;
        for(int i=0;i<store.length;i++)
        {
            if(store[i].equals(reply))
            {
                System.out.println("Yes it is in the aisle "+(i+1));
                found=true;
                break;
            }
        
        }
        if(!found)
        {
            System.out.println("Sorryyy we ddo not sell taht here"); 
        }
        scan.close();
        

    }
}
