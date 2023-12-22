package at.mes.basic.oop.examples.cars;

import at.mes.basic.oop.examples.cars.Producer;

import java.util.ArrayList;

public class Car {
    private String color;
    private int maxspeed;
    private double basisprice;
    private double basisverbrauch;
    private Engine engine;
    private int distance;

    public Car(String color, int distance, int maxspeed, double basisprice, double basisverbrauch, Engine engine) {
        this.color = color;
        this.maxspeed = maxspeed;
        this.basisprice = basisprice;
        this.basisverbrauch = basisverbrauch;
        this.engine = engine;
    }

    public void information(Producer producer){

    }

    public void rPrice(Producer producer){
        double preis = basisprice - basisprice / 100 * producer.getRabatt();

        System.out.println("Der Preis mit dem Rabatt von " + producer.getName() + " ist: " + preis + "€");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getBasisprice() {
        return basisprice;
    }

    public void setBasisprice(double basisprice) {
        this.basisprice = basisprice;
    }

    public double getBasisverbrauch() {
        return basisverbrauch;
    }

    public void setBasisverbrauch(double basisverbrauch) {
        if(distance < 50000) {
            this.basisverbrauch = basisverbrauch;
        }
        else {
            this.basisverbrauch = basisverbrauch * 1.098;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
