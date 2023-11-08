package at.mes.basic.struct;
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


        int iZahl = 0;

        do {
            Feld(spielfeld);
            if(iZahl % 2 == 0) {
                int move = Auswahl(spielfeld, 1);
                int Zeile = (move - 1) / 3;
                int Spalte = (move - 1) % 3;

                if(spielfeld[Zeile][Spalte] == ' ') {
                    spielfeld[Zeile][Spalte] = 'X';
                }
                else{
                    System.out.println("Dieses Feld ist bereits belegt. Wähle ein neues.");
                    continue;
                }
            }
            else{
                int move = Auswahl(spielfeld, 2);
                int Zeile = (move - 1) / 3;
                int Spalte = (move - 1) % 3;

                if(spielfeld[Zeile][Spalte] == ' ') {
                    spielfeld[Zeile][Spalte] = 'O';
                }
                else{
                    System.out.println("Dieses Feld ist bereits belegt. Wähle ein neues.");
                    continue;
                }
            }
            iZahl++;

            gewonnen = gewonnencheck(spielfeld);
            if(gewonnen) {
                Feld(spielfeld);
                if(iZahl % 2 == 0) {
                    System.out.println("Spieler 2 hat gewonnen.");
                } else {
                    System.out.println("Spieler 1 hat gewonnen.");
                }
            }
        }while(!gewonnen && iZahl < 9);

        if(!gewonnen) {
            System.out.println("Unentschieden, es hat keiner gewonnen.");
        }
    }

    public static int Auswahl(char[][] spielfeld, int spieler) {
        Scanner scanner = new Scanner(System.in);
        int move = 0;
        do {
            System.out.println("Spieler " + spieler + ", gebe ein wo du deinen Punkt setzen willst (1-9) ");
            move = scanner.nextInt();
        }while(move < 1 || move > 9 || !moeglichmove(spielfeld, move));
        return move;
    }

    public static void Feld(char[][] spielfeld) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + spielfeld[i][j] + " ");
            }
            System.out.println("|");

            if (i < 2) {
                System.out.println("-------------");
            }
        }

    }

    public static boolean gewonnencheck(char[][] spielfeld) {
        for (int Zeile = 0; Zeile < 3; Zeile++) {
            if (spielfeld[Zeile][0] == spielfeld[Zeile][1] &&
                    spielfeld[Zeile][1] == spielfeld[Zeile][2] &&
                    spielfeld[Zeile][0] != ' ') {
                return true;
            }
        }

        for (int Spalte = 0; Spalte < 3; Spalte++) {
            if (spielfeld[0][Spalte] == spielfeld[1][Spalte] &&
                    spielfeld[1][Spalte] == spielfeld[2][Spalte] &&
                    spielfeld[0][Spalte] != ' ') {
                return true;
            }
        }

        if ((spielfeld[0][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[2][2] && spielfeld[0][0] != ' ') ||
                (spielfeld[0][2] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[2][0] && spielfeld[0][2] != ' ')) {
            return true;
        }

        return false;
    }

    public static boolean moeglichmove(char[][] spielfeld, int move) {
        int Zeile = (move - 1) / 3;
        int Spalte = (move - 1) % 3;
        return spielfeld[Zeile][Spalte] == ' ';
    }
}
