public class MainFinal{
    public static void main(String[] args) {
        
        EmployeeFinal john = new EmployeeFinal("John", 45);
        EmployeeFinal lisa = new EmployeeFinal("Lisa", 20);

        System.out.println("Retirement Age: " + EmployeeFinal.MAX_AGE);
        System.out.println("Minimum Working Age: " + EmployeeFinal.MIN_AGE);

        System.out.println(john.getName() + ", you can retire in " + (65 - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - 18) + " years.");

    }
}
