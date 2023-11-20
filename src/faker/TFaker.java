package faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class TFaker {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("Insertdaten.txt");
            for (int i = 1; i < 101; i++) {

                //String name = faker.name().fullName(); // Miss Samanta Schmidt
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton
                String name = faker.artist().name();
                String streetAddress = faker.address().country(); // 60018 Sawayn Brooks Suite 449
                String dish = faker.food().dish();
                double price = faker.number().randomDouble(2, 0, 500);
                double gprice = faker.number().randomDouble(2, 100, 4000);
                int number1 = faker.number().numberBetween(1980,2023);
                int number2 = faker.number().numberBetween(1,12);
                int number3 = faker.number().numberBetween(1,29);
                int number4 = faker.number().numberBetween(1,100);
                String genre = faker.music().genre();
                String email = faker.name().firstName() + "." + faker.name().lastName() + "@faker.at";
                String number = faker.phoneNumber().phoneNumber();
                /*
                if(i == 100) {
                    myWriter.write("(" + i + ", '" + name + "', '" + streetAddress + "');");
                }
                else{
                    myWriter.write("(" + i + ", '" + name + "', '" + streetAddress + "'),\n");
                }*/

                /*if(i == 100) {
                    myWriter.write("(" + i + ", '" + dish + "', " + i + ", " + price + ", '" + number1 + "-" + number2 + "-" + number3 + "', '" + genre + "');");
                }
                else{
                    myWriter.write("(" + i + ", '" + dish + "', " + i + ", " + price + ", '" + number1 + "-" + number2 + "-" + number3 + "', '" + genre + "'),\n");
                }*/

                /*if(i == 100) {
                    myWriter.write("(" + i + ", '" + firstName + " " + lastName + "', '" + email + "', '" + number + "');");
                }
                else{
                    myWriter.write("(" + i + ", '" + firstName + " " + lastName + "', '" + email + "', '" + number + "'), \n");
                }*/

                if(i == 100){
                    myWriter.write("(" + i + ", " + i + ", " + gprice + ");");
                }
                else{
                    myWriter.write("(" + i + ", " + i + ", " + gprice + "), \n");
                }

                /*if(i == 100){
                    myWriter.write("(" + i + ", " + i + ", " + number4 + ", " + price + ");");
                }
                else {
                    myWriter.write("(" + i + ", " + i + ", " + number4 + ", " + price + "), \n");
                }*/
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
