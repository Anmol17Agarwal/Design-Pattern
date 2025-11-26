package BuilderPattern.UserProfile;

public class AddressBuilder {
    UserProfileBuilder mainBuilder;

    AddressBuilder(UserProfileBuilder builder){
        this.mainBuilder = builder;
    }

    public AddressBuilder city(String city){
        mainBuilder.city = city;
        return this;
    }
    public AddressBuilder state(String state){
        mainBuilder.state = state;
        return this;
    }
    public AddressBuilder country(String country){
        mainBuilder.country = country;
        return this;
    }

    public UserProfileBuilder done(){
        return mainBuilder;
    }
}
