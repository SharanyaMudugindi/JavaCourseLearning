public class CityEquality {

    private String name;
    private long population;


    public CityEquality(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public CityEquality(CityEquality source) {
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;  // Same object, so return true
        }

        if (!(o instanceof CityEquality)) {
            return false;  // If the object is not of type CityEquality, return false
        }

        CityEquality other = (CityEquality) o;  // Typecast to CityEquality
        return this.name.equals(other.name) && this.population == other.population;  // Compare name and population
    }


}

