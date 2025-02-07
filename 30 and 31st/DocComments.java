public class DocComments {
    public static void main(String[] args) {

        
    }
    /**
     * Function name:greet
     * 
     * Inside the function
     * 1.prints:"Hi"
     */
    public static void greet()
    {
        System.err.println("Hi");
    }

    /**
     * Function name:printText
     * @param name(String)
     * @param age(String)
     * 
     * Inside the function:
     * 1.Prints :name and age
     */
    public static void printText(String name,String age)
    {
        System.out.println("Hi,I'm "+name+" and I'm "+age+" years old.");
    }

    /**
     * 
     * Function name:calculateArea
     * @param length(double)
     * @param breadth(double)
     * @return area(double)
     *
     * Inside the function:
     * 1.This function first calculates the area and then return the area
     */
    public static double calculateArea(double length,double breadth)
    {
        double area=length*breadth;
        return area;
    }
}
