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

    public void turnOn(Battery batterie){
        if (!isOn && hasPower && batterie.getCharging_status() >= 5.0) {
            isOn = true;
            System.out.println("Verbraucher angeschlossen");
            batterie.chargingverbrauch();
        } else {
            System.out.println("Die Fernbedienung ist bereits an, oder hat keinen Akku mehr.");
        }
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
