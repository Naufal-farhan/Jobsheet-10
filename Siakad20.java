import java.util.*;

public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int n = sc.nextInt();
        System.out.print("Masukkan jumlah Mata kuliah : ");
        int m = sc.nextInt();

        int[][] nilai = new int[n][m];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Matakuliah ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : " + totalPerSiswa / m);

        }
        for (int j = 0; j < m; j++) {
            double totalperMatkul = 0;
            for (int i = 0; i < n; i++) {
                totalperMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah ke-"+(j+1)+" : " + totalperMatkul / n);
        }
    }
}
