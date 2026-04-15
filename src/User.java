public class User {
    private String nama;
    private int umur;

    // Encapsulation

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
       if (umur > 0) {
            this.umur = umur;
        }
    }
}