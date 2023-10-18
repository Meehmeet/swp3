package at.mes.basic;
import java.awt.im.spi.InputMethodDescriptor;
import java.io.CharConversionException;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        int selection = 0;
        String selection2 = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe deinen String ein den du verschluesseln willst");
        selection2 = scanner.nextLine();

        System.out.println("\nGebe ein um wie viele Zeilen sich der String verschieben soll");
        selection = scanner.nextInt();


        String result = encrypt(selection, selection2);
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();

        for(int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            encryptedString += Character.toString(letter);

        }

        return encryptedString;
    }
}