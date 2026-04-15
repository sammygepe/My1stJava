public class User {
    private String nama;
    private int umur;

    public User(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}