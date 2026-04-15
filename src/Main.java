import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        try {
            User u1 = new User("Elkan", 20);
            User u2 = new User("Baggot", 25);
            User u3 = new User("Andi", -5); // ini error

            users.add(u1);
            users.add(u2);
            users.add(u3);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (User u : users) {
            System.out.println(u);
        }
    }
}