package at.mes.basic;
import java.awt.im.spi.InputMethodDescriptor;
import java.io.CharConversionException;

public class Caesar {
    public static void main(String[] args) {
        String result = encrypt(1,"Hallo");
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