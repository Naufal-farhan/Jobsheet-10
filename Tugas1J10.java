import java.util.*;

public class Tugas1J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];

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
       for(int i = 0 ;i < survei.length;i++){
        System.out.println("Penilaian dari responden ke-"+(i+1)+Arrays.toString(survei[i]));
       }
    }

}
