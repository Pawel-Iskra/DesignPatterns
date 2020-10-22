package builder.inner_class;


public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .buildName("user1_name")
                .buildLastName("user1_last_name")
                .buildLogin("user1_login")
                .buildPassword("user1_password")
                .buildEmail("user1_email")
                .buildAge(28)
                .build();
        System.out.println("user1 = " + user1);

    }
}