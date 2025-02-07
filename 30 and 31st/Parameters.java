import java.util.Scanner;
public class Parameters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        
        System.out.println("The area of the rectangle: "+areaRectangle(l,b));
        sc.close();
    }
    public static double areaRectangle(double length,double breadth)
    {
        return length*breadth;
    }
    
}
