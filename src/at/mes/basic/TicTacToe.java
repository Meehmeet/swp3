package at.mes.basic;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("TicTacToe Beginnt");
        System.out.println("-----------------");

        boolean gewonnen = false;
        char[][] spielfeld = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spielfeld[i][j] = ' ';
            }
        }


        int[] ZahlArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] moveArray = {0,0,0,0,0,0,0,0,0};
        int iZahl = -1;

        do {
            iZahl = iZahl + 1;
            moveArray[iZahl] = Auswahl();
            gewonnen = Feld(ZahlArray, moveArray, spielfeld);

            iZahl = iZahl + 1;
            moveArray[iZahl] = Auswahl2();
            gewonnen = Feld(ZahlArray, moveArray, spielfeld);

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

    public static boolean Feld(int[] Array, int[] moveArray, char[][] spielfeld) {
        boolean ausgabe = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(spielfeld[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }

        return ausgabe;
    }

}
