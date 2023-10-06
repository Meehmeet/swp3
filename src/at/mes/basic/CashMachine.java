package at.mes.basic;

import java.util.Scanner;
public class CashMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float fKonto = 0;
        float fEinzahlung = 0;
        int selection = 0;
        float fAbheben = 0;
        char cWiederholung = 'b';

        do {
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden \n");
        System.out.println("Geben Sie eine der vier Zahlen ein");


            selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Geben Sie ein wie viel Geld Sie auf Ihr Konto hinzufügen wollen");
                fEinzahlung = scanner.nextFloat();
                fKonto = fKonto + fEinzahlung;

                System.out.println("Wollen Sie eine weitere Eingabe im Banksystem tätigen? (a)");
                cWiederholung = scanner.next().charAt(0);
            }

            else if (selection == 2) {
                do {

                    System.out.println("Geben Sie ein wie viel Geld Sie abheben wollen");
                    fAbheben = scanner.nextFloat();

                    if (fAbheben > fKonto) {
                        System.out.println("Sie können nicht mehr Geld abheben als Sie besitzen");
                    }
                }while(fAbheben > fKonto);

                    if (fAbheben < fKonto) {
                        fKonto = fKonto - fAbheben;
                    }

                System.out.println("Wollen Sie eine weitere Eingabe im Banksystem tätigen? (a)");
                cWiederholung = scanner.next().charAt(0);
            }

            else if (selection == 3) {
                System.out.println("Sie haben gerade " + fKonto + "€ auf Ihrem Konto");

                System.out.println("Wollen Sie eine weitere Eingabe im Banksystem tätigen? (a)");
                cWiederholung = scanner.next().charAt(0);
            }

            else if (selection == 4) {
                System.out.println("Beendet");
            }

        } while(cWiederholung == 'a');
    }
}
