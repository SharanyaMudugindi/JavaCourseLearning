public class Main {
  
    public static void main(String[] args) {
        /*Person person = new Person();
 
        person.name = "Rayan Slim";
        person.nationality = "Canadian";
        person.dateOfBirth = "01/01/1111";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 5;
        
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
        Car nissan=new Car("Nissan", 1.1220, 2019, "blue");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        System. out.println("This " + nissan.make + " is worth $" + nissan.price +
        ". It was built in " + nissan.year + ". It is " + nissan.color + ". \n") ;
        System. out.println("This " + dodge.make + " is worth $" + dodge.price +
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
        System.out.println("New example\n");
        Person person=new Person("Rayan Slim","Canadian", "01/01/1111", 5);
        System.out.println("The name of the person is "+person.name+" and holds the nationality as. "+person.nationality+" Born on "+person.dateOfBirth+" and his seat number is "+person.seatNumber);*/
        
        Car nissan=new Car("Nissan", 1.1220, 2019, "blue");
        System.out.println("\nNew example");
        System.out.println("This "+nissan.getMake()+" is worth $ "+nissan.getPrice()+". It was built in "+nissan.getYear()+". It is "+nissan.getColor()+" in color");
        nissan.setColor("blackbrown");
        nissan.setYear(2000);
        System.out.println("\nNew example");
        System.out.println("This "+nissan.getMake()+" is worth $ "+nissan.getPrice()+". It was built in "+nissan.getYear()+". It is "+nissan.getColor()+" in color");

    }
  
  
}
