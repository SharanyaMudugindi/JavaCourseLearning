import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExampleTwo {
    public static void main(String[] args) {
        try{
        readFile("greetings.txt");
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }

    }
    
    public static void readFile(String fileName)throws FileNotFoundException {
        FileInputStream file=new FileInputStream("greetings.txt");
        Scanner sc=new Scanner(file);
        System.out.println(sc.nextLine());
        sc.close();
    }
}