package at.mes.basic.oop.Remote;

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
        if(!isOn) {
            if (batterie.getCharging_status() >= 5.0) {
                System.out.println("Verbraucher angeschlossen");
                batterie.chargingverbrauch();
            } else {
                System.out.println("Die Fernbedienung hat keinen Akku mehr.");
            }

            if (batterie2.getCharging_status() >= 5.0) {
                System.out.println("Verbraucher angeschlossen");
                batterie2.chargingverbrauch();
            } else {
                System.out.println("Die Fernbedienung hat keinen Akku mehr.");
            }
            isOn = true;
        }else{
            System.out.println("Die Fernbedienung ist schon an.");
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
        System.out.println("Der Akku der Batterie 1 beträgt: " + batterie1.getCharging_status());
        System.out.println("Der Akku der Batterie 2 beträgt: " + batterie2.getCharging_status());

        double Mittelwert = (batterie1.getCharging_status() + batterie2.getCharging_status()) / 2;
        System.out.println("Mittelwert der Batterien: " + Mittelwert);

        System.out.println("Sind die Batterien an: " + isOn);
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
