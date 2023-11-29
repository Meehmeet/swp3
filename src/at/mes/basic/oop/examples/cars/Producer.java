package at.mes.basic.oop.examples.cars;

import java.util.ArrayList;

public class Producer {
    private String name;
    private String country;
    private int rabatt;
    private ArrayList<Car> cars;

    public Producer(String name, String country, int rabatt, ArrayList<Car> cars) {
        this.name = name;
        this.country = country;
        this.rabatt = rabatt;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRabatt() {
        return rabatt;
    }

    public void setRabatt(int rabatt) {
        this.rabatt = rabatt;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
