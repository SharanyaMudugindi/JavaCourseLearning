import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu={"Espresso","Iced Tea","Macchiato"};
        menu[2]="Latte";
        System.out.println(Arrays.toString(menu));
        String[] newMenu= new String[5];
        for(int i=0;i<menu.length;i++)
        {
            System.out.println(i+". "+menu[i]);
        }
        for(int i=0;i<menu.length;i++)
        {
            newMenu[i]=menu[i];
        }
        newMenu[3]="bla";
        newMenu[4]="blaa";
        

        
        System.out.println(Arrays.toString(newMenu));


    }

}
