public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) 
        {
            case "sunny":System.out.println("Go enjoyyyy out!!");break;
            case "cloudy":System.out.println("Cloudy you might need an umbrella");break;
            case "rainy":System.out.println("Carry an umbrella along with you");break;
            case "snowy":System.out.println("Its Snowy out do not go out");break;
            default:System.out.println("Stay home and chill");break;
        }


        // Section 2: User role
        int role = 2;
        switch (role) 
        {
            case 1:System.out.println("You are admin");break;
            case 2:System.out.println("You are editor");break;
            case 3:System.out.println("You are user");break;
            default:System.out.println("You are no one");break;
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":System.out.println("GOOOO!!!");break;
            case "yellow":System.out.println("Slow down");break;
            case "red":System.out.println("Stoppp!!!!");break;
            default:System.out.println("Do what ever you want");break;
        }
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":System.out.println("C");break;
            case "Firefox":System.out.println("F");break;
            case "Safari":System.out.println("S");break;
            case "opera":System.out.println("O");break;
            default:System.out.println("Other browser");break;
        }
        
        

    }
}
