public class ReturnValues
{
    public static void main(String[] args) 
    {
        double res=areaRectangle(2.5,3.5);
        System.out.println(res);
        double res1=areaRectangle(4.5,3.5);
        System.out.println(res1);
        double res2=areaRectangle(6.5,3.5);
        System.out.println(res2);
        printArea(4.5, 3.5, res1);
        String englishExplain=expalinArea("English");
        String frenchExplain=expalinArea("French");
        String spenishExplainant=expalinArea("Spanish");
        String italianExplainant=expalinArea("Italian");
        System.out.println(englishExplain +"\n"+frenchExplain+"\n"+spenishExplainant+"\n"+italianExplainant);


    }
    public static double areaRectangle(double length,double breadth)
    {
        double area=length*breadth;
        return area;
    }
    public static String expalinArea(String language)
    {
        switch (language) {
            case "English":return "Area equals length*breadth";
            case "French":return "French \"La surface est egale a la longueur * la largeur";
            case "Spanish":return "area es igual a largo * ancho";
            default:return "Language not available";
        }
    }
    public static void  printArea(double length,double width,double area)
    {
        System.out.println("A rectangle with a length of"+length+" and a breadth of "+width+" results area: "+area);
    }

}
