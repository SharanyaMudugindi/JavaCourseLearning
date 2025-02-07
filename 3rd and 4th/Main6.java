public class Main6 {
  
    public static void main(String[] args) {
 
 
        PersonMain6 person = new PersonMain6("Rayan Slim", "Canadian", "01/01/1111", 5);
 
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println(person);
 
    }
  
}
