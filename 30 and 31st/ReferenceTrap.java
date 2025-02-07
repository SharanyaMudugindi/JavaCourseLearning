import java.util.Arrays;
public class ReferenceTrap {
    public static void main(String[] args) {
        int[] num={1,2,3};
        int[] num2=num;
        num2[2]=4;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
        String[] staffLastYear={"Sharanya","Shar","Shara"};
        String[] staffThisYear=new String[3];
        /*String[] staffThisYear=staffLastYear;
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));
        staffThisYear[2]="Shaarnya";
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));*/
        //instead of this
        //solution 1
        for(int i=0;i<staffThisYear.length;i++)
        {
            staffThisYear[i]=staffLastYear[i];
        }
        staffThisYear[2]="meeee";
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));
        //solution 2(Better solution)
        System.out.println("Second solution");
        String[] staffLastYear1={"Sharanya","Shar","Shara"};
        String[] staffThisYear1=Arrays.copyOf(staffLastYear1,2);
        System.out.println(Arrays.toString(staffThisYear1));
        System.out.println(Arrays.toString(staffLastYear1));

    }


}
