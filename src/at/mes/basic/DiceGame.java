package at.mes.basic;

import java.util.Random;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        int WinsPlayer = 0;
        int WinsComputer = 0;
        int Draws = 0;
        int selection = 0;
        Scanner scanner = new Scanner(System.in);
        char cWiederholung = 'b';

        do {
            cWiederholung = 'b';
            System.out.println("--------------DICE GAME--------------");
            System.out.println("Menue:");
            System.out.println("\t Würfeln (1)");
            System.out.println("\t Stopp (2)");

            selection = scanner.nextInt();

            if (selection == 1) {
                for (int i = 0; i < 6; i++) {
                    int randomPlayer = random.nextInt(6) + 1;
                    int randomComputer = random.nextInt(6) + 1;

                    if (randomPlayer > randomComputer) {
                        WinsPlayer++;
                    } else if (randomComputer > randomPlayer) {
                        WinsComputer++;
                    } else {
                        Draws++;
                    }
                    System.out.println("\n Roll " + (i + 1));
                    System.out.println("Player: " + randomPlayer + "\nComputer: " + randomComputer);
                }

                System.out.println("\n--------------END--------------");
                System.out.println("Player Wins: " + WinsPlayer + "\nComputer Wins: " + WinsComputer + "\nDraws: " + Draws);

                System.out.println("\n Wollen Sie nocheinmal spielen (j) oder abbrechen (n)?");
                cWiederholung = scanner.next().charAt(0);
            }
            else{
            System.out.println("Ende");
            }
    }while(cWiederholung == 'j');
    }
}
