package BuilderPattern.UserProfile;

public class UserProfileBuilder {
    String firstName;
    String lastName;
    int age;

    String city;
    String state;
    String country;

    String email;
    boolean isTwoFactorEnabled;

    public PersonalBuilder personal(){
        return new PersonalBuilder(this);
    }
    public AddressBuilder address(){
        return new AddressBuilder(this);
    }
    public AccountBuilder account(){
        return new AccountBuilder(this);
    }
    public UserProfile build(){
        return new UserProfile(this);
    }
}
