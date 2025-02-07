import java.util.Scanner;
public class Detention{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi Sharanya,I can write lines for you.\nTell me what do you want me to write and how many times shoul i wirte it for you?");
        String line=sc.nextLine();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("\n"+i+". "+line);
        }
        sc.close();

    }
}
