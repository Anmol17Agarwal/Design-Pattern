package BuilderPattern.UserDetails;

public class BuilderClient {

        public static void main(String[] args) {

            User user = User.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .age(25)
                    .email("john@mail.com")
                    .country("India")
                    .isActive(true)
                    .build();

            System.out.println("User created successfully: " + user);
        }
    }

