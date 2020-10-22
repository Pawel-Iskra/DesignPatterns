package builder.inner_class;

public class User {
    private String name;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private int age;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.login = userBuilder.login;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }


    public static class UserBuilder {
        private String name;
        private String lastName;
        private String login;
        private String password;
        private String email;
        private int age;

        public UserBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder buildLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder buildLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder buildPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder buildAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}