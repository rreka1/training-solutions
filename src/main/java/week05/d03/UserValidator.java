package week05.d03;

import java.util.Arrays;
import java.util.List;

public class UserValidator {

    public void validate(List<User> users) {
        for (User user : users) {
            boolean nullName = user.getName() == null;
            boolean emptyName = user.getName().isEmpty();
            boolean invalidAge = user.getAge() < 0 || user.getAge() > 120;
            if (nullName) {
                throw new NullPointerException("Name must not be null! " + user);
            }
            if (emptyName) {
                throw new IllegalArgumentException("Name must not be empty! " + user);
            }
            if (invalidAge) {
                throw new IllegalArgumentException("Age is between 0 and 120! " + user + " age: " + user.getAge());
            }
        }
    }

    public static void main(String[] args) {
        UserValidator uv = new UserValidator();
        User user1 = new User("John Doe", -1);
        User user2 = new User("", 34);
        try {
            uv.validate(Arrays.asList(user1, user2));
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
