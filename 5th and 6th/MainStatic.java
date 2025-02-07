public class MainStatic{
    public static void main(String[] args) {
        
        UserStatic liam = new UserStatic("Liam", "Smith");
        UserStatic olivia = new UserStatic("Olivia", "Davis");
        UserStatic ethan = new UserStatic("Ethan", "Martins");

        System.out.println(liam.getFirstName() + " " + liam.getLastName());
        System.out.println(olivia.getFirstName() + " " + olivia.getLastName());
        System.out.println(ethan.getFirstName() + " " + ethan.getLastName());
        System.out.println("User Count: " + UserStatic.userCount);

    }
}