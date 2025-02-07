public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    public Car(String make,double price,int year,String color)
    {
        this.make=make;
        this.price=price;
        this.year=year;
        this.color=color;

    }
    /*public String getMake(String make)
    {
        return this.make;
        
    }
    public double getPrice(double price)
    {
        return this.price;
    }
    public int getYear(int year)
    {
        return this.year;
    }
    public String getColor(String color)
    {
        return this.color;
    }
    public void setMake(String make)
    {
        this.make=make;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setYear(int year)

    {
        this.year=year;
    }
    public void setColor(String color)
    {
        this.color=color;
    }*/

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
