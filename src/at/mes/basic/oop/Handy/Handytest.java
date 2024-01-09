package at.mes.basic.oop.Handy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Handytest {
    public static void main(String[] args) {
        Phonefile pf1 = new Phonefile(1000,"hallo","jpg");
        Phonefile pf2 = new Phonefile(2000,"guten","png");

        SDCard sd1 = new SDCard(100000);

        ArrayList<Phonefile> phonefileArrayList = new ArrayList<>();

        phonefileArrayList.add(pf1);
        phonefileArrayList.add(pf2);

        sd1.addFile(pf1);
        sd1.addFile(pf2);

        for (Phonefile file: phonefileArrayList) {
            System.out.println(file.getSize());
        }

        SIM s1 = new SIM(1,"123456789");
        Camera c1 = new Camera(1000);


        Phone p1 = new Phone("purple", s1, c1, sd1);

        System.out.println(p1.getSdcard().getCapacity());

        /*for (Phonefile file: phonefileArrayList) {
            System.out.println(file.getSize());
        }*/

        s1.sim();
        p1.makeCall("123892");
        p1.takePicture("luft", "png");
        p1.printAllFiles();
        p1.getFreeSpace();
    }
}
