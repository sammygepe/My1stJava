import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setNama("Elkan");
        u1.setUmur(20);

        User u2 = new User();
        u2.setNama("Baggot");
        u2.setUmur(25);

        users.add(u1);
        users.add(u2);

        for (User u : users) {
            System.out.println("Nama: " + u.getNama() + ", Umur: " + u.getUmur());
        }
    }
}