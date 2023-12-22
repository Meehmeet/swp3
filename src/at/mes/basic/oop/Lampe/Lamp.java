package at.mes.basic.oop.Lampe;

import at.mes.basic.oop.Lampe.Gluehelemente;

import java.util.ArrayList;

public class Lamp {
    private ArrayList<Gluehelemente> element;

    public Lamp(ArrayList<Gluehelemente> element) {
        this.element = element;
    }


    public void addGluehelement(Gluehelemente gluehelement){

    }

    public void turnAllOn(){
        for (Gluehelemente gluehelement : element){
            gluehelement.turnOn();
        }
    }

    public double getOverallPowerUsage(){
        double verbrauch = 0;
        for (Gluehelemente gluehelement : element){
            verbrauch = gluehelement.getPower() + verbrauch;
        }
        return verbrauch;
    }

    public void printNamesOfLightElements(){
        for (Gluehelemente gluehelement : element){
            System.out.println("Ich bin " + gluehelement.getName());
        }
    }

    public ArrayList<Gluehelemente> getElement() {
        return element;
    }

    public void setElement(ArrayList<Gluehelemente> element) {
        this.element = element;
    }


}
