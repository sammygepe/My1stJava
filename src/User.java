public class User {
    private String nama;
    private int umur;

    public User(String nama, int umur) throws Exception {
        this.nama = nama;

        if (umur < 0) {
            throw new Exception("Umur tidak valid");
        }

        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}