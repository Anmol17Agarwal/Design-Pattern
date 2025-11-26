package BuilderPattern.UserProfile;

public class UserClient {
    public static void main(String[] args) {

        UserProfile user = new UserProfileBuilder().personal()
                .firstName("Anmol")
                .lastName("Agarwal")
                .age(25)
                .done()
                .address()
                .city("Noida")
                .state("Uttar Pradesh")
                .country("India")
                .done()
                .account()
                .email("anmol1717agarwal@gmail.com")
                .isTwoFactorEnabled(true)
                .done().build();

        System.out.println(user);
    }
}
