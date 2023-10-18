package at.mes.basic;
import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String Palindrome = "";
        System.out.println("Gebe dein Wort, bei dem du wissen willst ob es Palindrome ist");
        Palindrome = scanner.nextLine();

        boolean result1 = isPalindrome(Palindrome);
        System.out.println("Palindrome: " + result1);



        String text = "";
        char search = 'a';

        System.out.println("\nGebe deinen Text ein bei dem du die Buchstaben zählen willst");
        text = scanner.nextLine();

        System.out.println("Gebe den Buchstaben ein den du zählen willst");
        search = scanner.next().charAt(0);

        int result2 = countLetters(text,search);
        System.out.println("Anzahl des Buchstaben: " + result2);




    }
    public static boolean isPalindrome(String Palindrome) {
        boolean Ausgabe = true;
        int iHilfe = 0;
        int i2 = 0;
        char[] PalindromArray = Palindrome.toCharArray();

        for(int i = PalindromArray.length - 1; i >= 0; i--)
        {
            if(PalindromArray[i] == PalindromArray[i2])
            {
                i2++;
            }

            else{
                iHilfe = 1;
            }

            if(iHilfe == 1)
            {
                Ausgabe = false;
            }
        }
        return Ausgabe;
    }

    public static int countLetters(String text, char search) {
        char[] textArray = text.toCharArray();
        int count = 0;

        for(int i = 0; i < textArray.length; i++){
            if(textArray[i]==search) {
                count++;
            }
        }
        return count;
    }
}
