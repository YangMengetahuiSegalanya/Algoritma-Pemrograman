import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;

    public static void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public static void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}
