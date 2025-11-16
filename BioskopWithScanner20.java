import java.util.*;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "***";
            }
        }
        int pilihan;
        do {
            System.out.println("=== PILIH MENU ===");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilihlah menu 1/2/3 !!! : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama Penonton : ");
                    String nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris : ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom : ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if ((baris > 4 || kolom > 2) || (baris < 1 || kolom < 1)) {
                            System.out.println("Kursi penonton tidak tersedia");
                            continue;
                        }
                        if (penonton[baris - 1][kolom - 1].equals("***")) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Input Data penonton Berhasil!!!");
                            break;
                        } else {
                            System.out.println("Kursi telah terisi!!!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println(String.join(",  ", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println("Anda telah keluar dari menu!!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, input pilihan menu kembali!!!");
            }
        } while (pilihan != 3);
    }

}
