package at.mes.basic.oop.examples.cars;

public class Engine {
    public enum TYPE{Diesel, Benzin};
    private int horsepower;
    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
