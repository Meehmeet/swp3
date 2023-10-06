package at.mes.basic;

import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        int WinsPlayer = 0;
        int WinsComputer = 0;
        int Draws = 0;

        System.out.println("--------------DICE GAME--------------");
        for(int i = 0; i < 6; i++)
        {
            int randomPlayer = random.nextInt(6 ) + 1;
            int randomComputer = random.nextInt(6 ) + 1;

            if(randomPlayer > randomComputer)
            {
                WinsPlayer++;
            }

            else if (randomComputer > randomPlayer)
            {
                WinsComputer++;
            }

            else{
                Draws++;
            }
            System.out.println("\n Roll " + (i + 1));
            System.out.println("Player: " + randomPlayer + "\nComputer: " + randomComputer);
        }

        System.out.println("\n--------------END--------------");
        System.out.println("Player Wins: " + WinsPlayer + "\nComputer Wins: " + WinsComputer + "\nDraws: " + Draws);
    }
}
