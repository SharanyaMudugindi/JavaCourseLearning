import java.util.Objects;

public class ContactMapEquality {

    private String name;
    private int age;

    public ContactMapEquality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ContactMapEquality(ContactMapEquality source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equals(Object o){

    if (o == this)
        return true;
    if (!(o instanceof ContactMapEquality))
    {
    return false;}

    ContactMapEquality contact = (ContactMapEquality) o;
    return Objects.equals(name, contact.name) && age == contact.age;
    }
    public int hashCode () {
    return Objects.hash(name, age);


}
}
