import java.util.Scanner;
public class SoucetSoucin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cisla = sc.nextLine();
        String[] cislaArr = cisla.split(" ", 2);
        int soucet = Integer.parseInt(cislaArr[0]) + Integer.parseInt(cislaArr[1]);
        int soucin = Integer.parseInt(cislaArr[0]) * Integer.parseInt(cislaArr[1]);

        System.out.println(soucet + " " + soucin);
        // System.out.printf("Součet je %d a součin je %d%n", soucet, soucin); // můžeme použit ten hezký výstup
    }
}
