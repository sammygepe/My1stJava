import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        User u1 = new User("Elkan", 20);
        User u2 = new User("Baggot", 25);
        User u3 = new User("Andi", 40);

        users.add(u1);
        users.add(u2);
        users.add(u3);

        for (User u : users) {
            System.out.println(u);
        }

        // sample try catch
        try {
            int umur = -5;

            if (umur < 0) {
                throw new Exception("Umur tidak valid");
            }

            System.out.println("Umur: " + umur);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}