package at.mes.basic;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("TicTacToe Beginnt");
        System.out.println("-----------------");

        boolean gewonnen = false;
        int[] ZahlArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        do {

            int xWert = Auswahl();
            gewonnen = Feld(ZahlArray, xWert);

            int oWert = Auswahl2();
            gewonnen = Feld(ZahlArray, oWert);

        } while (gewonnen = false);
    }

    public static int Auswahl() {
        Scanner scanner = new Scanner(System.in);
        int move = 0;
        System.out.println("Spieler 1, gebe ein wo du dein x setzen willst (1-9) ");
        move = scanner.nextInt();

        return move;
    }

    public static int Auswahl2() {
        Scanner scanner = new Scanner(System.in);
        int move2 = 0;
        System.out.println("Spieler 2, gebe ein wo du dein o setzen willst (1-9) ");
        move2 = scanner.nextInt();

        return move2;
    }

    public static boolean Feld(int[] Array, int move) {
     boolean ausgabe = false;

        for(int i = 1; i < Array.length; i++)
        {

        }
     return ausgabe;
    }

}
