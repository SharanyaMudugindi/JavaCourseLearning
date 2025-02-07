import java.util.ArrayList;

public class MainEquality {
    public static void main(String[] args) {

        CityEquality paris = new CityEquality("Paris", 2161000);
        CityEquality copy = paris;

        System.out.println(paris.equals(copy));
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<CityEquality> cities = new ArrayList<>();
        cities.add(new CityEquality("Paris", 2161000));
        cities.add(new CityEquality("Florence", 382258));
        cities.add(new CityEquality("Venice", 261905));
        cities.add(new CityEquality("Versailles", 85771));
        cities.add(new CityEquality("London", 8982000));
        
        System.out.println(cities.contains(paris));
    }

}