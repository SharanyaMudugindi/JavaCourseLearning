import java.util.Scanner;
public class SignIn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username="Sharanya";
        String password="aynarahS2443";

        System.out.println("Enter you username and password");
        String enteredUsername=sc.nextLine();
        String enteredPassword=sc.nextLine();

        while(!username.equals(enteredUsername)||!password.equals(enteredPassword))
        {
            System.out.println("Your username or password is incorrect...please try again.");
            enteredUsername=sc.nextLine();
            enteredPassword=sc.nextLine();
        }
        System.out.println("You have successfully logged in.Hurray!!!");
        sc.close();

    }
    
}
