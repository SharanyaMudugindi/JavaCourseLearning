public class PersonMain3 {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber; 
//constructor
    public PersonMain3(String name,String nationality,String dateOfBirth,int seatNumber)
    {
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;

    }
    public PersonMain3(PersonMain3 source)
    {
        this.name=source.name;
        this.nationality=source.nationality;
        this.dateOfBirth=source.dateOfBirth;
        this.seatNumber=source.seatNumber;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getNationality()
    {
        return this.nationality;
    }
    public void setNationality(String nationality)
    {
        this.nationality=nationality;
    }
    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public int getSeatNumber()
    {
        return seatNumber;

    }
    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber=seatNumber;
    }

}