import java.lang.reflect.Array;

public class Start {
    public static void main(String[] args) {

        System.out.print("Meh\nmet");
        System.out.println(123);
        System.out.print("ok");

        int iZahl = 1;      // -2,147,483,648 bis 2,147,483,647
        char cBuchstabe;
        float fZahl;    // 6 to 7 digits
        double dZahl;   // 15 digits
        String sSatz;
        boolean bJaNein;
        int[] iArray;
        long lZahl;     // -9223372036854775808 to 9223372036854775807
        byte bklein;    //-128 to 127
        short sZahl;    //-32,768 to 32,767

        iZahl = 5;
        cBuchstabe = 'a';
        fZahl = 23;
        dZahl = 12;
        sSatz = "Hallo";
        bJaNein = true;
        iArray = new int[4];
        iArray[0] = 3;
        lZahl= 1123123;
        bklein = 2;
        sZahl = 4;

        System.out.print(dZahl);

    }
}