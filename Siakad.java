import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa(1000);
    static int jumlahData = 0;
    static boolean sorted = false;
    static Scanner input = new Scanner(System.in);

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
        jumlahData = jumlahData + 1;
    }

    public static void tampilData() {
        System.out.println("Berikut Data Anda");
        int i = 0;
        while (i < jumlahData) {
            System.out.println(Mahasiswa[1].getNim() + " " + Mahasiswa[1].getNama());
            i++;
        }
    }

    public static void urutkanData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih Algortima Pengurutan");
        System.out.println("1. EXCHANGE SORT");
        System.out.println("2. SELECTION SORT");
        System.out.println("3. QUICK SORT");
        System.out.println("4. INSERTION SORT");
        System.out.println("5. BUBBLE SORT");
        System.out.println("6. SHELL SORT");
        System.out.println("PILIH ALGORITMA");
        int algo = scanner.nextInt();
        switch (algo) {
            case 1: {
                siakad.exchangeSort();
                break;
            }
            case 2: {
                siakad.selectionSort();
                break;
            }
            case 3: {
                siakad.quicksort(Mahasiswa, low: 0, high: jumlahData-1);
                break;
            }
            case 4: {
                siakad.insertionsort();
                break;
            }
            case 5: {
                siakad.bubbleSort();
                break;
            }
            case 6: {
                siakad.shellSort();
                break;
            }
        }
    }

    public static void exchangeSort() {
        for (int x = 0; x < jumlahData; x++) {
            for (int y = x + 1; y < jumlahData; y++) {
                if (Mahasiswa[x].getNim().compareTo(Mahasiswa[y].getNim()) >= 1) {
                    Mahasiswa temp = Mahasiswa[x];
                    Mahasiswa[x] = Mahasiswa[y];
                    Mahasiswa[y] = temp;
                }
            }
        }
    }

    public static void selectionSort() {
        int minIndx;
        Mahasiswa temp;
        for (int x = 0; x < jumlahData - 1; x++) {
            minIndx = i;
            for (int y = i + 1; jumlahData; y++) {
                if (Mahasiswa[j].getNim() < Mahasiswa[mainIndx].getNim()) {
                    minIndx = j;
                }
            }

            temp = Mahasiswa[i];
            Mahasiswa[i] = Mahasiswa[minIndx];
            Mahasiswa[minIndx] = temp;

        }
    }

    static void quickSort(Mahasiswa arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        sorted = true;
    }

    static int partition(Mahasiswa arr[], int low, int high) {
        int pivot = arr[high].getNim();
        int i = (low - 1);
        Mahasiswa temp;
        for (int j = low; j <= high - 1; j++) {
            if (Mahasiswa[j].getNim() < pivot) {
                i++;
                temp = Mahasiswa[j];
                Mahasiswa[j] = Mahasiswa[i];
                Mahasiswa[i] = temp;

            }
        }
        temp = Mahasiswa[i + 1];
        Mahasiswa[i + 1] = Mahasiswa[high];
        Mahasiswa[high] = temp;
        return (i + 1);
    }

    public void InsertionSort() {
        for (int m = 1; m < jumlahData; ++m) {
            Mahasiswa key = mahasiswa[m];
            int l = m - 1;
            while (mahasiswa[l].getNim() > key.getNim() && l > 0) {
                mahasiswa[l + 1] = mahasiswa[l];
                l = l - 1;

            }
            mahasiswa[l + 1] = key;

        }
    }

    public void bubbleSort() {
        boolean noSwap;
        Mahasiswa temp;
        for (int i = jumlahData; i > 0; i--) {
            noSwap = true;
            for (int j = 0; j < i - 1; j++) {
                if (mahasiswa[j].getNim() > mahasiswa[j + 1].getNim()) {
                    temp = mahasiswa[j];
                    mahasiswa[j] = mahasiswa[j + 1];
                    mahasiswa[j + 1] = temp;
                    noSwap = false;
                }

            }
            if (noSwap)
                break;
        }
    }

    public void shellSort() {
        int juml = jumlahData - 1;
        int gap = juml / 2;
        boolean swap = true;
        Mahasiswa temp;
        while (gap > 0) {
            swap = true;
            while (swap == true) {
                swap = false;
                for (int i = 0; i <= (juml - gap); i++) {
                    if (mahasiswa[i].getNim() > mahasiswa[i + gap].getNim()) {
                        temp = mahasiswa[i];
                        mahasiswa[i] = mahasiswa[i + gap];
                        mahasiswa[i + gap] = temp;
                        swap = true;
                    }
                }
            }
            gap = gap / 2;
        }
    }

    public static void UAS() {
        if (jumlahData == 0) { // o(n)
            System.out.println("Tidak ada data");
            menu();
        } else { // o(1)
            int jarak = jumlahData;
            int susut = 13;
            int urut = 0;
            while (urut == 0) { // o(n)
                jarak = (jarak * 10) / susut;
                if (jarak <= 1) { // o(1)
                    jarak = 1;
                    urut = 1;
                    for (int i = 0; i + jarak < jumlahData; i++) { // o(1)
                        if (Mahasiswa[i].getNim().compareTo(Mahasiswa[i + jarak].getNim()) > 0) { // o(n)
                            Mahasiswa temp = Mahasiswa[i];
                            Mahasiswa[i] = Mahasiswa[i + jarak];
                            Mahasiswa[i + jarak] = temp;
                            urut = 0;
                        }
                    }
                }
            }
            System.out.println("Data telah diurutkan silahkan tampilkan data");
            menu();
        }
    }

    public static void caridata() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Algoritma Pencarian");
        System.out.println("1. LINEAR SEACRH");
        System.out.println("2. BINARY SEACRH");
        System.out.print("PILIH MENU = ");
        switch (cari) {
            case 1: {
                linearSearch();
                break;
            }
            case 2: {
                binarySearch();
                break;
            }
        }
    }

    System.out.println("Masukan Nim :");

    String filterValue = input.next();
    Integer indexFound=siakad.binarySearch(mahasiswa,filterValue,0,jumlahData-1);if(indexFound!=null)
    {
        System.out.println("Data yang anda cari :");
        System.out.println("Nim : " + mahasiswa[indexFound].getNim());
        System.out.println("Nama : " + mahasiswa[indexFound].getNama() + "\n");
    }else
    {
        System.out.println("Data tidak ditemukan");
    }

    break;

    public static void linearSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("MASUKAN NAMA/NIM = ");
        String xdata = scan.nextLine();
        for (int i = 0; i < jumlahData; i++) {
            String temp = Mahasiswa[i].getNama();
            String temp2 = Mahasiswa[i].getNim();
            if (xdata.equals(temp)) {
                System.out.println("DATA YANG DICARI DITEMUKAN !!!");
                System.out.println(Mahasiswa[i].getNama() + "  " + Mahasiswa[i].getNim());
                System.out.println(" ");
            } else if (xdata.equals(temp2)) {
                System.out.println("DATA YANG DICARI DITEMUKAN !!!");
                System.out.println(Mahasiswa[i].getNama() + "  " + Mahasiswa[i].getNim());
                System.out.println(" ");
            }
        }
        menu();
    }

    public static void binarySearch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("MASUKAN NAMA/NIM = ");
        String data = scan.nextLine();
        int low = 0;
        int high = jumlahData - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (Mahasiswa[mid].getNim().compareTo(data) < 0) {
                low = mid + 1;
            } else if (Mahasiswa[mid].getNim().compareTo(data) > 0) {
                high = mid - 1;
            } else if (Mahasiswa[mid].getNim().equals(data)) {
                System.out.println("DATA YANG DICARI DITEMUKAN !!!");
                System.out.println(Mahasiswa[mid].getNama() + " " + Mahasiswa[mid].getNama());
                System.out.println(" ");
                menu();
            }
            if (Mahasiswa[mid].getNama().compareTo(data) < 0) {
                low = mid + 1;
            } else if (Mhasiswa[mid].getNama().compareTo(data) > 0) {
                high = mid - 1;
            } else if (Mahasiswa[mid].getNama().equals(data)) {
                System.out.println("DATA YANG DICARI DITEMUKAN !!!");
                System.out.println(Mahasiswa[mid].getNama() + " " + Mahasiswa[mid].getNama());
                System.out.println(" ");
                menu();
            }
            System.out.println("DATA YANG DICARI TIDAK DITEMUKAN !!!");
            System.out.println(" ");
            menu();
        }
    }

    public static void editData() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < jumlahData) {
            System.out.print(i + 1 + ". ");
            System.out.println(Mahasiswa[i].getNama() + " " + Mahasiswa[i].getNim());
            i++;
        }
        System.out.print("MASUKAN NOMOR YANG AKAN DIUBAH = ");
        int xdata = scan.nextInt() - 1;
        System.out.print("MASUKAN NAMA BARU = ");
        String nama = scan.next();
        System.out.print("MASUKAN NIM BARU = ");
        String nim = scan.next();

        Mahasiswa[xdata].setNama(nama);
        Mahasiswa[xdata].setNim(nim);
        menu();
    }

    public static void hapusData(Integer index) {
        System.out.println("Nama : " + Mahasiswa[index].getNama());
        System.out.println("Nim : " + Mahasiswa[index].getNim());
        System.out.println("Hapus Data ini? y/n");
        String pil = input.next();
        if (pil.equalsIgnoreCase("y")) {
            Mahasiswa[index] = null;
            for (int i = 0; i < jumlahData - 1; i++) {
                Mahasiswa temp;
                if (Mahasiswa[i] == null) {
                    temp = Mahasiswa[i + 1];
                    Mahasiswa[i] = Mahasiswa[i + 1];
                    Mahasiswa[i + 1] = null;

                }
            }
            jumlahData = jumlahData - 1;
            System.out.println("Data Terhapus!");
        } else {
        }
    }

    public static void main(string[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Menu Siakad");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Urutkan Data");
            System.out.println("4. Cari Data");
            System.out.println("5. Edit Data");
            System.out.println("6. Hapus Data");
            System.out.println("7. UAS");
            System.out.println("8. Keluar");
            System.out.println("Pilih Menu");
            menu = scan.nextInt();
            if (menu == 1) {
                tambahData();
            } else if (menu == 2) {
                tampilData();
            } else if (menu == 3) {
                urutkanData();
            } else if (menu == 4) {
                cariData();
            } else if (menu == 5) {
                editData();
            } else if (menu == 6) {
                hapusData(null);
            } else if (menu == 7) {
                UAS();
            } else if (menu == 8) {
                keluar();
            }
        } while (menu != 3);
    }
}