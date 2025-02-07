import java.util.Arrays;
 
public class Main5 {
  
    public static void main(String[] args) {
 
 
        PersonMain5 person = new PersonMain5("Rayan Slim", "Canadian", "01/01/1111", 5);
 
        if (person.applyPassport() == true) {
            person.setPassport();
        }
 
        System.out.println("Name: " + person.getName() + "\n"
        +  "Nationality: " + person.getNationality() + "\n"
        +  "Date of Birth: " + person.getDateOfBirth() + "\n"
        +  "Seat Number: " + person.getSeatNumber() + "\n"
        +  "Passport: " + Arrays.toString(person.getPassport()) + "\n");



    }

  
}
