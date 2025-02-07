import java.util.HashMap;
import java.util.Map;

public class MainMapEquality {
    public static void main(String[] args) {
        
        /************************** Hashcode ************************/
        ContactMapEquality contact = new ContactMapEquality("Alice", 30);
        ContactMapEquality contactCopy = new ContactMapEquality("Aliceee",30);

        System.out.println("First Hashcode: " + contact.hashCode());
        System.out.println("Second Hashcode: " + contactCopy.hashCode());

        /************************** Equals ************************/

        System.out.println("Equality: " + contact.equals(contactCopy));

        /************************** HashCode and Equals ************************/

       /*  Map<ContactMapEquality, String> peopleMap = new HashMap<>();
        
        peopleMap.put(new ContactMapEquality("Alice", 30), "1806 Farm Meadow Drive");
        peopleMap.put(new ContactMapEquality("Bob", 35), "4046 Weekley Street");
        peopleMap.put(new ContactMapEquality("Charles", 36), "1110 Cerullo Road");
        peopleMap.put(new ContactMapEquality("Todd", 35), "3300 Ross Street");
        peopleMap.put(new ContactMapEquality("Leah", 43), "3392 Clarksburg Park Road");
        peopleMap.put(new ContactMapEquality("Brad", 40), "499 Diane Street");
        peopleMap.put(new ContactMapEquality("Stephen", 36), "4 Meadowview Drive");
        peopleMap.put(new ContactMapEquality("Lauren", 37), "514 Summit Park Avenue");
        peopleMap.put(new ContactMapEquality("Adam", 42), "146 Devils Hill Road");
        peopleMap.put(new ContactMapEquality("Hilary", 34), "397 Winifred Way");
        peopleMap.put(new ContactMapEquality("Noah", 41), "1833 Maloy Court");

        System.out.println("\nAlice's address is: " + peopleMap.get(new ContactMapEquality("Alice", 30)));

        System.out.println("\nAdam's address is: " + peopleMap.get(new ContactMapEquality("Adam", 42)));

        System.out.print("\nIs Noah, 41 years of age, in my contacts? ");
        String response = peopleMap.containsKey(new ContactMapEquality("Noah", 41)) ? "Yes!" : "No, sorry";
        System.out.println(response);*/


    }
}
