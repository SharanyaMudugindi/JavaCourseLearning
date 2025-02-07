 public class Main3 {
  
    /*public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        person.setSeatNumber(10);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        Person twin = new Person(person);
        twin.setName("Jad Slim");
        twin.setSeatNumber(3);
    
        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: " + twin.getSeatNumber() + "\n");*/
        public static void main(String[] args) {
            //person
            PersonMain3 person=new PersonMain3("Sharanya","Indain","24-04-2003",1);
            System.out.println("This name of the person is "+person.getName());
            PersonMain3 twin=new PersonMain3(person);
            twin.setName("bla");
            System.out.println("This name of the person is "+person.getName());
            System.out.println("This name of the person is "+twin.getName());

            //car
            String[] spareParts=new String[] {"Tires","keys"};
            //CarMain3 car=new CarMain3("Nissan",1300000,2019,"Blue");
            CarMain3 car=new CarMain3("Nissan",1300000,2019,"Blue",spareParts);
            System.out.println("This is a "+car.getMake()+" its price is "+car.getPrice()+". It was launched in "+car.getYear()
            +" and it is "+car.getColor()+" in color");
            CarMain3 carTwin=new CarMain3(car);
            carTwin.setPrice((carTwin.getPrice()-carTwin.getPrice()*0.05));
            System.out.println("After the discount of 5%,The price of the "+carTwin.getMake()+" which was launched in the year "+carTwin.getYear()+" comes to price of "+carTwin.getPrice()
            );
            carTwin.drive();

            System.out.println(car);
            System.out.println(carTwin);
            
          

        }

  
  
}
