package BuilderPattern.UserDetails;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String country;
    private final boolean isActive;

   User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.country = userBuilder.country;
        this.isActive = userBuilder.isActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public boolean isActive() {
        return isActive;
    }
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
