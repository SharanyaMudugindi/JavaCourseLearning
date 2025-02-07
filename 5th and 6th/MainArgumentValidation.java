import java.util.Scanner;

public class MainArgumentValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserArgumentValidation user = new UserArgumentValidation();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        
        String username = scanner.nextLine() ;
        if (username. isBlank()) {
            System.out.println("Sorry, that is an invalid username");
        }
        else
        {
            user.setUsername (scanner.nextLine());
        }
        System.out.print ("Your age is currently " + 0 + ". Please update it here: ");
        if(scanner.hasNextInt()){
        int age = scanner.nextInt();
        if (age < 0)
        {
            System.out.println("Sorry, that is an invalid age");
        } else {
        user.setAge (age);}
        }
        scanner.close();
       
}
}