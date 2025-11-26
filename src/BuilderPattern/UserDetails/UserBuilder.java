package BuilderPattern.UserDetails;

public class UserBuilder {
    String firstName;
    String lastName;
    int age;
    String email;
    String country;
    boolean isActive;

    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public UserBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public UserBuilder age(int age){
        this.age = age;
        return this;
    }
    public UserBuilder email(String email){
        this.email = email;
        return this;
    }
    public UserBuilder country(String country){
        this.country = country;
        return this;
    }
    public UserBuilder isActive(boolean isActive){
        this.isActive = isActive;
        return this;
    }
    public User build(){
        return new User(this);
    }


}
