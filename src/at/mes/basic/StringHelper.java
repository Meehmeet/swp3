package at.mes.basic;
import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String Palindrome = "";
        System.out.println("Gebe dein Wort, bei dem du wissen willst ob es Palindrome ist");
        Palindrome = scanner.nextLine();




        String text = "";
        char search = 'a';

        System.out.println("Gebe deinen Text ein bei dem du die Buchstaben zählen willst");
        text = scanner.nextLine();

        System.out.println("Gebe den Buchstaben ein den du zählen willst");
        search = scanner.next().charAt(0);

        int result = countLetters(text,search);
        System.out.println("Anzahl des Buchstaben: " + result);




    }
    public static boolean isPalindrome(String Palindrome) {
        boolean Ausgabe = true;
        char[] Palindrome

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
