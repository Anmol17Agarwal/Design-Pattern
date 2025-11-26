package BuilderPattern.UserProfile;

public class UserProfile {
    private final String firstName;
    private final String lastName;
    private final int age;

    private final String city;
    private final String state;
    private final String country;

    private final String email;
    private final boolean isTwoFactorEnabled;

    UserProfile(UserProfileBuilder userProfileBuilder){
        this.firstName = userProfileBuilder.firstName;;
        this.lastName = userProfileBuilder.lastName;
        this.age = userProfileBuilder.age;
        this.city = userProfileBuilder.city;
        this.state = userProfileBuilder.state;;
        this.country = userProfileBuilder.country;
        this.email = userProfileBuilder.email;
        this.isTwoFactorEnabled = userProfileBuilder.isTwoFactorEnabled;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", isTwoFactorEnabled=" + isTwoFactorEnabled +
                '}';
    }
}
