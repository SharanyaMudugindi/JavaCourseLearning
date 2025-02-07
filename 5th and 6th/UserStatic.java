public class UserStatic {

    private String firstName;
    private String lastName;
    static int userCount=0;

    public UserStatic(String firstName, String lastName) {
        userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}