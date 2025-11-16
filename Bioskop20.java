import java.util.*;
public class Bioskop20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Joko";
        penonton[0][1] = "Widodo";
        penonton[1][0] = "Gibran";
        penonton[1][1] = "Owo";
        penonton[2][0] = "Teddy";
        penonton[2][1] = "Esemka";
        penonton[3][0] = "Fafafufu";
        penonton[3][1] = "Hana";

        for(int i = 0; i < penonton.length; i++){
            System.out.println("Penonton pada baris ke-"+(i+1)+" : "+String.join(", ", penonton[i]));
        }

        System.out.println(penonton.length);
        for(String[] barisPenonton : penonton){
            System.out.println("Panjang baris : "+barisPenonton.length);
        }
        System.out.println("Penonton pada baris ke-3 : ");  
        for(String i : penonton[2]){
            System.out.println(i);
        }
    }
}