import java.util.*;
public class Bioskop2{
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

        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
    }
}