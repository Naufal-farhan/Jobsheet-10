import java.util.*;

public class Tugas1J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];
        double[] rataPertanyaan = new double[6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Masukkan nilai penilain responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai untuk pertanyaan ke-" + (j + 1) + "(Skala 1-5) : ");
                int nilai = sc.nextInt();

                if (nilai <= 5 && nilai > 0) {
                    survei[i][j] = nilai;
                } else {
                    System.out.println("Input gagal, Masukkan kembali dengan skala 1-5 !!!!.....");
                    j--;
                    continue;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Penilaian dari responden ke-" + (i + 1) + Arrays.toString(survei[i]));
        }

        System.out.println();
        for (int i = 0; i < survei.length; i++) {
            double total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            System.out.println("Rata Rata penilaian responden ke-" + (i + 1) + " : " + total / 6);
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += survei[j][i];
            }
            rataPertanyaan[i] = total / 10;
        }
        for (int i = 0; i < rataPertanyaan.length; i++) {
            System.out.println("Rata Rata per pertanyaan ke-" + (i + 1) + " : " + rataPertanyaan[i]);
        }
        System.out.println();
        int total = 0;
        double rataSemua = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            rataSemua = total / 60;
        }
        System.out.println("Rata rata keseluruhan : " + rataSemua);
    }
}
