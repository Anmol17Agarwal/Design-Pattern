package BuilderPattern.UserProfile;

public class PersonalBuilder {
    UserProfileBuilder mainBuilder;

    public PersonalBuilder(UserProfileBuilder builder){
        this.mainBuilder = builder;
    }
    public PersonalBuilder firstName(String firstName){
        mainBuilder.firstName=firstName;
        return this;
    }
    public PersonalBuilder lastName(String lastName){
        mainBuilder.lastName=lastName;
        return this;
    }
    public PersonalBuilder age(int age){
        mainBuilder.age=age;
        return this;
    }
    public UserProfileBuilder done(){
        return mainBuilder;
    }
}
