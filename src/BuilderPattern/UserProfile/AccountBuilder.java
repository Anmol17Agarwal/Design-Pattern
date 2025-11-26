package BuilderPattern.UserProfile;

public class AccountBuilder {
    UserProfileBuilder mainBuilder;

    AccountBuilder(UserProfileBuilder builder){
        this.mainBuilder = builder;
    }

    public AccountBuilder email(String email){
        mainBuilder.email = email;
        return this;
    }
    public AccountBuilder isTwoFactorEnabled(boolean isTwoFactorEnabled){
        mainBuilder.isTwoFactorEnabled = isTwoFactorEnabled;
        return this;
    }

    public UserProfileBuilder done(){
        return mainBuilder;
    }
}
