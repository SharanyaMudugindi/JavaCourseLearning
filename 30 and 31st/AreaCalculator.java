public class AreaCalculator {
    public static void main(String[] args) {
        double square=areaSquare(2);
        double rectangle=areaRectangle(3,4);
        double triangle=areaTriangle(4,5);
        double circle=areaCircle(4);
        printAll(square,rectangle,triangle,circle);

    }
    public static double areaSquare(double side)
    {
        if(side<0)
        {
            System.out.println("Calculation not possible");
        }
        return Math.pow(side,2);
    }
    public static double areaRectangle(double length,double width)
    {
        if(length<=0 || width<=0)
        {
            System.out.println("Calculation not possible");
        }
        return length*width;
    }
    public static double areaTriangle(double base,double height)
    {
        if(base<=0 || height<=0)
        {
            System.out.println("Calculation not possible");
        }
        return (base*height)/2;
    }
    public static double areaCircle(double radius)
    {
        if(radius<=0)
        {
            System.out.println("Calculation not possible");
   
        }
        return Math.PI*Math.pow(radius,2);
    }
    public static void printAll(double square,double rectangle,double triangle,double circle)
    {
        System.out.println("The area of square "+square);
        System.out.println("The area of rectangle "+rectangle);
        System.out.println("The area of triangle "+triangle);
        System.out.println("The area of circle "+circle);
    }
}
