import java.util.*;

public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Matakuliah ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : " + totalPerSiswa / 3);

        }
        for (int j = 0; j < 3; j++) {
            double totalperMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalperMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah ke-"+(j+1)+" : " + totalperMatkul / 4);
        }
    }
}
