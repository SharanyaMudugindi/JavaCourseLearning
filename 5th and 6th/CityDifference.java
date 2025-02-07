public class CityDifference {

    private String name;
    private long population;


    public CityDifference(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public CityDifference(CityDifference source) {
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
   
    }



