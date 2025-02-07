public class Main4 {
  
    public static void main(String[] args) {
        PersonMain4 person = new PersonMain4("Rayan Slim", "Canadian", "01/01/1111", 5);
 
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
 
        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
        }
        
    }
  
  
}
