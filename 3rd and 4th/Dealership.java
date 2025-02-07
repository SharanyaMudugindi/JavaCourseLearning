public class Dealership {
    private CarMain3[] cars;

    public Dealership(CarMain3[] cars)
    {
        this.cars=new CarMain3[cars.length];
        for(int i=0;i<cars.length;i++)
        {
            this.cars[i]=new CarMain3(cars[i]);
            //this.cars=Arrays.copyOf(cars,cars.length);this wont work it agains refers to thae same set of array elements
        
        }
    }
    public String toString()
    {

        String temp=" ";
        for(int i=0;i<this.cars.length;i++)
        {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }































        
        return temp;

    }
    public void sell(int index)
    {
        cars[index].drive();
    }

    }

    
