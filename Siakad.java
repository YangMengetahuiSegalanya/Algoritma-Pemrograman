import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa(1000);
    static int jumlahData = 0;

    public static void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Silahkan Tambah Data");
        System.out.print("NIM = ");
        String nim = scan.nextLine();
        System.out.println("Nama = ");
        String nama = scan.nextLine();
        Mahasiswa[jumlahData] = new Mahasiswa();
        Mahasiswa[jumlahData].setNim(nim);
        Mahasiswa[jumlahData].setNama(nama);
        jumlahData++;
    }

    public static void tampilData() {
        System.out.println("Berikut Data Anda");
        int i = 0;
        while (i<jumlahData) {
            System.out.println(Mahasiswa[1].getNim()+" "+Mahasiswa[1].getNama());
        }
    }

    public static void main(string[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Menu Siakad");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu");
            menu = scan.nextInt();
            if (menu==1) {
                tambahData();
            } else if (menu==2) {
                tampilData();
            }
        } while (menu!=3);
        }

    }