import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ExampleOne {
    public static void main(String[] args) {
        try 
        {
        FileInputStream file=new FileInputStream("greetings.txt");
        Scanner sc=new Scanner(file);
        System.out.println(sc.nextLine());
        sc.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        finally{
            System.out.println("You entered to finally block");
        }
    }
    
}