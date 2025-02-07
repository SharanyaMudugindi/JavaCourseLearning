public class Weather {
    public static void main(String[] args) {
        double[] celsiusList= {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheitList=celsiusToFahrenheit(celsiusList);
        printAll(celsiusList, fahrenheitList);


    }
    public static double[] celsiusToFahrenheit(double[] celsiusList)
    {
        double[] fahrenheitList=new double[celsiusList.length];
        for(int i=0;i<celsiusList.length;i++)
        {
            fahrenheitList[i]=(celsiusList[i]/5*9)+32;
        }
        return fahrenheitList;
    }
    public static void printAll(double[] celsiusList,double[] fahrenheitList)
    {System.out.println("  Celsius\t\tFahrenheit");
        for(int i=0;i<celsiusList.length;i++)
        {
            
            System.out.println((i+1)+". "+celsiusList[i]+"\t\t\t"+fahrenheitList[i]+"\n");
        }
    }


}
