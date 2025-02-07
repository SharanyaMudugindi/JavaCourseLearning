public class Beer {
    public static void main(String[] args) {
        for (int i = 200; i > 0; i--) {
            singing(i);
        }
    }

    public static void singing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take 3 down, pass it around, " + (i-3) + " bottles of beer on the wall!"); 
 
    }
}
