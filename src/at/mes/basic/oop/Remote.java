package at.mes.basic.oop;

import java.util.ArrayList;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private ArrayList<Battery>batterien;

    public Remote(boolean isOn, boolean hasPower, ArrayList<Battery> batterien) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.batterien = batterien;
    }

    public void turnOn(Battery batterie, Battery batterie2){

        if (!isOn && hasPower && batterie.getCharging_status() >= 5.0) {
            isOn = true;
            System.out.println("Verbraucher angeschlossen");
            batterie.chargingverbrauch();
        } else {
            System.out.println("Die Fernbedienung ist bereits an, oder hat keinen Akku mehr.");
        }

        if (!isOn && hasPower && batterie2.getCharging_status() >= 5.0) {
            isOn = true;
            System.out.println("Verbraucher angeschlossen");
            batterie2.chargingverbrauch();
        } else {
            System.out.println("Die Fernbedienung ist bereits an, oder hat keinen Akku mehr.");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Kein Verbraucher angeschlossen.");
    }
    public void Power(Battery batterie, Battery batterie2){
        if(batterie.getCharging_status() > 0)
        {
            hasPower = true;
            System.out.println("Die Fernbedienung hat noch Akku.");
        }
        else{
            hasPower = false;
            System.out.println("Die Fernbedienung hat keinen Akku mehr.");
        }

        if(batterie2.getCharging_status() > 0)
        {
            hasPower = true;
            System.out.println("Die Fernbedienung hat noch Akku.");
        }
        else{
            hasPower = false;
            System.out.println("Die Fernbedienung hat keinen Akku mehr.");
        }
    }

    public void getStatus(Battery batterie1, Battery batterie2){
        System.out.println("Der Akku der Batterie beträgt: " + batterie1.getCharging_status());
        System.out.println("Der Akku der Batterie beträgt: " + batterie2.getCharging_status());
    }

    public ArrayList<Battery> getBatterien() {
        return batterien;
    }

    public void setBatterien(ArrayList<Battery> batterien) {
        this.batterien = batterien;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }
}
