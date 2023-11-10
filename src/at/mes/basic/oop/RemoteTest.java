package at.mes.basic.oop;

import java.util.ArrayList;

public class RemoteTest {
    public static void main(String[] args) {

        Battery batterie1 = new Battery(50);
        Battery batterie2 = new Battery(80);
        ArrayList<Battery> batteryArrayList = new ArrayList<>();
        batteryArrayList.add(batterie1);
        batteryArrayList.add(batterie2);
        Remote fernbedienung = new Remote(true,true,batteryArrayList);

    }
}
